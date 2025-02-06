import java.awt.*;

public class Scania extends Truck {

    public double platformAngle = 0;

    private double maxAngle = 70;
    private double minAngle = 0;




    public Scania() {
        super(3, 150, Color.white, "Scania");

        isPlatformraised();
        isMoving();

    }



    public void platformRaise(double amount){

        if(isMoving()){
            System.out.println("Cannot move platform if truck is moving!!");
            currentSpeed = 0;
        }
        else if (platformAngle > maxAngle){
            System.out.println("Cannot move past the angle limit");
            platformAngle = maxAngle;
        }

        else platformAngle += amount;


    };

    public void platformLower(double amount){
        if(isMoving()){
            System.out.println("Cannot move platform if truck is moving!!");
            currentSpeed = 0;
        }
        else if (platformAngle < minAngle){
            System.out.println("Cannot move past the angle limit");
            platformAngle = minAngle;
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