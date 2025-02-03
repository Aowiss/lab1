import java.awt.*;

public class Scania extends Car {

    public double platformAngle = 0;

    private double maxAngle = 70;
    private double minAngle = 0;



    public Scania() {
        super(3, 150, Color.white, "Scania");

        isPlatformraised();

    }


    public boolean isMoving()
    {
        boolean movedetect = false;

        if (currentSpeed > 0) {
           movedetect = true;

        }
        return movedetect;

    }
    public void platformRaise(double amount){

        if(isMoving()){
            System.out.println("Cannot move if truck is moving!!");
        }
        else if (platformAngle == maxAngle){
            System.out.println("Cannot move past the angle limit");
        }

        else platformAngle += amount;


    };

    public void platformLower(double amount){
        if(isMoving()){
            System.out.println("Cannot move if truck is moving!!");
        }
        else if (platformAngle == minAngle){
            System.out.println("Cannot move past the angle limit");
        }
        else platformAngle -= amount;
    }
    public void isPlatformraised(){
        if (platformAngle > 0 && currentSpeed > 0){
            System.out.println("Cannot drive with the platform raised!!");
            currentSpeed = 0;
        }
    }
}