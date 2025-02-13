import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTransportTest {

    @Test
    void getPlatformState() {

    }



    @Test
    void canTransportmove() {
        CarTransport cartrans = new CarTransport();

        cartrans.startEngine();
        cartrans.canTransportmove();

        assertEquals(0, cartrans.getCurrentSpeed());
    }

    @Test
    void withinRadius() {
        CarTransport cartrans = new CarTransport();
        Car car = new Saab95();

        car.SetX(6);

        car.SetY(6);


        assertEquals(false, cartrans.withinRadius(car));
;

    }

    @Test
    void canLoad() {
        CarTransport cartrans = new CarTransport();

        Car car = new Saab95();



        assertEquals(true, cartrans.canLoad(car));
    }

    @Test
    void loadCar() {
        CarTransport cartrans = new CarTransport();

        Car car = new Saab95();
        cartrans.loadCar(car);

        cartrans.setX(8);



        assertEquals(8.0, car.GetX());
        assertTrue(cartrans.GetCargosize() == 1);
    }

    @Test
    void deLoadCar() {
        CarTransport cartrans = new CarTransport();
        Car car = new Saab95();



        assertEquals(null,  cartrans.deLoadCar(car));
    }
}