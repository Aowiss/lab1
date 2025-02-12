import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarWorkshopTest {

    @Test
    void addCar() {
        CarWorkshop<Volvo240> VWC = new CarWorkshop<>();
        Volvo240 volvo240 = new Volvo240();
        Saab95 saab95 = new Saab95();

        VWC.addCar(volvo240);

        CarWorkshop<Saab95> swc = new CarWorkshop<>();

        swc.addCar(saab95);



    }

    @Test
    void removeCar() {
        CarWorkshop<Volvo240> VWC = new CarWorkshop<>();

        Volvo240 volvo = new Volvo240();

        VWC.addCar(volvo);


        VWC.removeCar(volvo);

    }

    @Test
    void getMaxCars() {
    }
}