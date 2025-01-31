import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class Saab95Test {

    @org.junit.jupiter.api.Test
    void getCurrentSpeed() {
        Saab95 sab = new Saab95();
        assertEquals(0, sab.getCurrentSpeed());
    }

    @org.junit.jupiter.api.Test
    void speedFactor() {
        Saab95 sab = new Saab95();
        assertEquals(1.25, sab.speedFactor());
    }

    @org.junit.jupiter.api.Test
    void incrementSpeed() {
        Saab95 sab = new Saab95();
        assertEquals(0, sab.getCurrentSpeed());
    }

    @org.junit.jupiter.api.Test
    void decrementSpeed() {
        Saab95 sab = new Saab95();
        assertEquals(0,sab.getCurrentSpeed());
    }



    @org.junit.jupiter.api.Test
    void testspeedonbrake(){
        Saab95 sab = new Saab95();
        for(int i = 0; i<200; i++){
            sab.brake(2);

        }
        assertEquals(true, 0 <= sab.currentSpeed  && sab.currentSpeed <= sab.enginePower);
    }
    @org.junit.jupiter.api.Test
    void testspeedongas(){
        Saab95 sab = new Saab95();
        for(int i = 0; i<200; i++){
            sab.gas(1);


        }
        assertEquals(true, 0 <= sab.currentSpeed && sab.currentSpeed <= sab.enginePower);
    }

   

    @org.junit.jupiter.api.Test
    void move() {

        Saab95 Saab95 = new Saab95();
        Saab95.startEngine();

        Saab95.move();


        assertEquals(0.1, Saab95.GetY());

        Saab95.startEngine();

        Saab95.turnLeft();

        Saab95.move();

        assertEquals(-0.1, Saab95.GetX());

        Saab95.startEngine();

        Saab95.turnLeft();

        Saab95.move();
        Saab95.move();

        assertEquals(-0.1, Saab95.GetY());


        Saab95.startEngine();
        Saab95.turnLeft();

        Saab95.move();
        Saab95.move();
        assertEquals(0.1, Saab95.GetX());
    }

    @org.junit.jupiter.api.Test
    void turnLeft() {
        Saab95 sab = new Saab95();
        sab.turnLeft();
        assertEquals(Directions.West, sab.getDirections());
        sab.turnLeft();
        assertEquals(Directions.South,sab.getDirections());
        sab.turnLeft();
        assertEquals(Directions.East, sab.getDirections());
        sab.turnLeft();
        assertEquals(Directions.North, sab.getDirections());
    }

    @org.junit.jupiter.api.Test
    void turnRight() {
        Saab95 sab = new Saab95();
        sab.turnRight();
        assertEquals(Directions.East, sab.getDirections());
        sab.turnRight();
        assertEquals(Directions.South,sab.getDirections());
        sab.turnRight();
        assertEquals(Directions.West, sab.getDirections());
        sab.turnRight();
        assertEquals(Directions.North, sab.getDirections());
    }

    @org.junit.jupiter.api.Test
    void getNrDoors() {
        Saab95 sab = new Saab95();

        assertEquals(2, sab.getNrDoors());
    }

    @org.junit.jupiter.api.Test
    void getEnginePower() {
        Saab95 sab = new Saab95();
        assertEquals(125, sab.getEnginePower());
    }

    @org.junit.jupiter.api.Test
    void testGetCurrentSpeed() {
    }

    @org.junit.jupiter.api.Test
    void getColor() {
        Saab95 sab = new Saab95();

        assertEquals(Color.red, sab.getColor());
    }

    @org.junit.jupiter.api.Test
    void setColor() {
        Saab95 sab = new Saab95();

        Color color =  sab.setColor(Color.black);

        assertEquals(Color.black, color);



    }

    @org.junit.jupiter.api.Test
    void testStartEngine() {

        Saab95 sab = new Saab95();

        sab.startEngine();

        assertEquals(0.1, sab.currentSpeed);
    }

    @org.junit.jupiter.api.Test
    void stopEngine() {

        Saab95 sab = new Saab95();
         sab.stopEngine();

        assertEquals(0, sab.currentSpeed );
    }

    @org.junit.jupiter.api.Test
    void setTurboOn() {

        Saab95 sab =  new Saab95();


        sab.setTurboOn();

        assertEquals(true,sab.turboOn );

    }

    @org.junit.jupiter.api.Test
    void setTurboOff() {
        Saab95 sab = new Saab95();

        sab.setTurboOff();

            assertEquals(false, sab.turboOn);
    }

    @org.junit.jupiter.api.Test
    void testSpeedFactor() {
        Saab95 sab = new Saab95();


        assertEquals(1.25, sab.speedFactor());

        sab.setTurboOn();

        assertEquals(1.625, sab.speedFactor());



    }

    @org.junit.jupiter.api.Test
    void testIncrementSpeed() {
        Car car = new Saab95();


        car.currentSpeed = 0;

        car.incrementSpeed(2);


        assertNotEquals(0, car.currentSpeed);

    }


}