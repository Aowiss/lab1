import java.awt.*;
import java.util.Objects;
import java.util.Stack;

public class CarTransport extends Truck {


    private static final double loadDistance = 5;


    private int x;
    private int y;

    private int maxCars;



    private Stack<Car> cargo = new Stack<>();
    public CarTransport(){

        super(2, 150, Color.black, "CarTransport");
        canTransportmove();

        this.x = x;
        this.y = y;


    }



    public void canTransportmove(){

        if (Objects.requireNonNull(platformState) == PlatformState.DOWN) if (isMoving()) {
            System.out.println("Can't move with ramp down");

            currentSpeed = 0;

        }
    }





    boolean withinRadius(Car car){

        double distance = Math.sqrt(Math.pow(car.GetX() - this.x, 2)) - Math.sqrt(Math.pow(car.GetY() - this.y,2));
        return distance <= loadDistance;

    }

    boolean canLoad(Car car){

        boolean loadable = false;
        if( (Objects.requireNonNull(platformState) == PlatformState.DOWN) && cargo.size() < maxCars && withinRadius(car)) loadable = true;

        return loadable;
    }
    public void loadCar(Car car, CarTransport cartransport){
        if(canLoad(car)){

            cargo.push(car);

            car.SetY(cartransport.GetY());
            car.SetX(cartransport.GetX());

        }


    }
    public Car deLoadCar(Car car) {

        if (!cargo.isEmpty() && canLoad(car)) {

            Car unloadedcar = cargo.pop();

            System.out.println("Car has been unloaded");

            return unloadedcar;

        } else return null;

    }





}

