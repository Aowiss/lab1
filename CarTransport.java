import java.awt.*;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Stack;

public class CarTransport extends Truck {






    private final int maxCars = 5;



    public int GetCargosize(){
        return cargo.size();
    }
    private ArrayDeque<Car> cargo = new ArrayDeque<>();
    public CarTransport(){

        super(2, 300, Color.black, "CarTransport");
        canTransportmove();




    }



    public void canTransportmove(){

        if (Objects.requireNonNull(getPlatformState()) == PlatformState.DOWN) if (isMoving()) {
            System.out.println("Can't move with ramp down");

            currentSpeed = 0;

        }
    }







    boolean canLoad(Car car){

        boolean loadable = false;
        if( (Objects.requireNonNull(getPlatformState()) == PlatformState.DOWN) && cargo.size() < maxCars && withinRadius(car)) {
            loadable = true;
        }

        return loadable;
    }
    public void loadCar(Car car){
        if(canLoad(car)){

            cargo.add(car);

            car.SetY(this.GetY());
            car.SetX(this.GetX());

        }


    }
    public Car deLoadCar(Car car) {

        if (!cargo.isEmpty() && canLoad(car)) {

            Car unloadedcar = cargo.remove();

            System.out.println("Car has been unloaded");

            return unloadedcar;

        } else return null;

    }





}

