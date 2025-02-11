import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarWorkshopTest {

    @Test
    void addCar() {
        CarWorkshop<Volvo240> VWC = new CarWorkshop<>();
        Volvo240 volvo240 = new Volvo240();
        VWC.addCar(volvo240);

        CarWorkshop<Saab95> swc = new CarWorkshop<>();
        Saab95 saab95 = new Saab95();




    }

    @Test
    void removeCar() {

    }

    @Test
    void getMaxCars() {
    }
}