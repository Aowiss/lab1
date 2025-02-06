import java.awt.*;

public abstract class Truck implements Movable{

    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName;

    public PlatformState platformState;

    public void getPlatformState(){
        this.platformState = platformState;
    }


    public double GetY(){
        return y;
    }

    public double GetX(){
        return x;
    }


    private double x;
    private double y;
    public final static double trimFactor = 1.25;


    public boolean isMoving() {
        boolean movedetect = false;

        if (currentSpeed > 0) {
            movedetect = true;

        }
        return movedetect;
    }




    private Directions directions;

    Truck(int nrDoors,double enginePower, Color color, String modelName){
        directions = Directions.North;
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
        platformState = PlatformState.DOWN;
    }

    public double getCurrentSpeed(){


        return currentSpeed;

    }
    public double speedFactor(){
        return enginePower * 0.01 * trimFactor;
    }

    public void incrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    public void decrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }
    public int getNrDoors(){
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
    }


    public Color getColor(){
        return color;
    }

    public Color setColor(Color clr){
        color = clr;
        return clr;
    }

    public void startEngine(){
        currentSpeed = 0.1;
    }

    public void stopEngine(){
        currentSpeed = 0;
    }

    public void gas(double amount){


        incrementSpeed(amount);

        if(currentSpeed > getEnginePower()){
            currentSpeed = getEnginePower();
        }
    }

    public void brake(double amount){




        decrementSpeed(amount);
        if(currentSpeed < 0){
            currentSpeed = 0;
        }

    }



    @Override
    public void move() {
        switch (directions){
            case North -> {
                y += currentSpeed;
            }
            case South -> {
                y -= currentSpeed;
            }
            case West -> {
                x -= currentSpeed;

            }
            case East -> {
                x += currentSpeed;
            }
        }


    }
    public Directions getDirections(){
        return this.directions;
    }

    @Override
    public void turnLeft() {
        switch (directions) {
            case North -> {
                this.directions = Directions.West;
                break;
            }

            case South -> {
                this.directions = Directions.East;
                break;
            }
            case West -> {
                this.directions = Directions.South;
                break;
            }
            case East -> {
                this.directions = Directions.North;
                break;
            }
        }

    }

    @Override
    public void turnRight() {
        switch (directions) {
            case North -> {
                this.directions = Directions.East;
                break;
            }
            case South -> {
                this.directions = Directions.West;
                break;
            }
            case West -> {
                this.directions = Directions.North;
                break;
            }
            case East -> {
                this.directions = Directions.South;
                break;
            }
        }

    }
}
