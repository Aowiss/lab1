import java.awt.*;

public abstract class Car implements Movable {

    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName;


    public double GetY(){
        return y;
    }

    public double GetX(){
        return x;
    }


    private double x;
    private double y;
    public final static double trimFactor = 1.25;







    private Directions directions;

    Car(int nrDoors,double enginePower, Color color, String modelName){
        directions = Directions.North;
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
    }

    public double getCurrentSpeed(){


        return currentSpeed;

    }
    public abstract double speedFactor();

    public void incrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
        if(currentSpeed > getEnginePower()){
            currentSpeed = getEnginePower();
        }
    }

    public void decrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
        if(currentSpeed < 0){
            currentSpeed = 0;
        }
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

    // TODO fix this method according to lab pm
    public void gas(double amount){

       if (amount < 0|| amount > 1) {
            throw new IllegalArgumentException("amount is not in range");

        }

        incrementSpeed(amount);


    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        if(amount < 0 || amount > 1) {
            throw new IllegalArgumentException("amount is not in range");

        }





        decrementSpeed(amount);


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
