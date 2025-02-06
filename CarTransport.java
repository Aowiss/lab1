import java.awt.*;
import java.util.Objects;
import java.util.Stack;

public class CarTransport extends Truck {


    private int maxCars = 5;

    private Stack<Car> cargo = new Stack<>();
    public CarTransport(){

        super(2, 150, Color.black, "CarTransport");
        canTransportmove();



    }

    public void canTransportmove(){

        if (Objects.requireNonNull(platformState) == PlatformState.DOWN) if (isMoving()) {
            System.out.println("Can't move with ramp down");

            currentSpeed = 0;

        }
    }


    boolean canLoad(){

        boolean loadable = false;
        if( (Objects.requireNonNull(platformState) == PlatformState.DOWN) && cargo.size() < maxCars) loadable = true;

        return loadable;
    }
    public void loadCar(Car car){
        if(canLoad()){

            cargo.push(car);

        }


    }
    public Car deLoadCar() {

        if (!cargo.isEmpty() && canLoad()) {

            Car unloadedcar = cargo.pop();

            System.out.println("Car has been unloaded");

            return unloadedcar;

        } else return null;

    }





}

