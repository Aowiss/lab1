import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class carTest {

    @org.junit.jupiter.api.Test
    void getCurrentSpeed() {
        Car car = new Saab95();
        assertEquals(0, car.getCurrentSpeed());
    }

    @org.junit.jupiter.api.Test
    void speedFactor() {
        Car car = new Saab95();
        assertEquals(1.25, car.speedFactor());
    }

    @org.junit.jupiter.api.Test
    void incrementSpeed() {
        Car car = new Saab95();
        assertEquals(0, car.getCurrentSpeed());
    }

    @org.junit.jupiter.api.Test
    void decrementSpeed() {
        Car car = new Saab95();
        assertEquals(0,car.getCurrentSpeed());
    }



    @org.junit.jupiter.api.Test
    void testspeedonbrake(){
        Car car = new Saab95();
        for(int i = 0; i<200; i++){
            car.brake(1);

        }
        assertEquals(true, 0 <= car.currentSpeed  && car.currentSpeed <= car.enginePower);
    }
    @org.junit.jupiter.api.Test
    void testspeedongas(){
        Car car = new Saab95();
        for(int i = 0; i<200; i++){
            car.gas(1);


        }
        assertEquals(true, 0 <= car.currentSpeed && car.currentSpeed <= car.enginePower);
    }



    @org.junit.jupiter.api.Test
    void move() {

        Car car = new Saab95();
        car.startEngine();

        car.move();


        assertEquals(0.1, car.GetY());

        car.startEngine();

        car.turnLeft();

        car.move();

        assertEquals(-0.1, car.GetX());

        car.startEngine();

        car.turnLeft();

        car.move();
        car.move();

        assertEquals(-0.1, car.GetY());


        car.startEngine();
        car.turnLeft();

        car.move();
        car.move();
        assertEquals(0.1, car.GetX());
    }

    @org.junit.jupiter.api.Test
    void turnLeft() {
        Car car = new Saab95();
        car.turnLeft();
        assertEquals(Directions.West, car.getDirections());
        car.turnLeft();
        assertEquals(Directions.South,car.getDirections());
        car.turnLeft();
        assertEquals(Directions.East, car.getDirections());
        car.turnLeft();
        assertEquals(Directions.North, car.getDirections());
    }

    @org.junit.jupiter.api.Test
    void turnRight() {
        Car car = new Saab95();
        car.turnRight();
        assertEquals(Directions.East, car.getDirections());
        car.turnRight();
        assertEquals(Directions.South,car.getDirections());
        car.turnRight();
        assertEquals(Directions.West, car.getDirections());
        car.turnRight();
        assertEquals(Directions.North, car.getDirections());
    }

    @org.junit.jupiter.api.Test
    void getNrDoors() {
        Car car = new Saab95();

        assertEquals(2, car.getNrDoors());
    }

    @org.junit.jupiter.api.Test
    void getEnginePower() {
        Car car = new Saab95();
        assertEquals(125, car.getEnginePower());
    }



    @org.junit.jupiter.api.Test
    void getColor() {
        Car car = new Saab95();

        assertEquals(Color.red, car.getColor());
    }

    @org.junit.jupiter.api.Test
    void setColor() {
        Car car = new Saab95();

        Color color =  car.setColor(Color.black);

        assertEquals(Color.black, color);



    }

    @org.junit.jupiter.api.Test
    void testStartEngine() {

        Car car = new Saab95();

        car.startEngine();

        assertEquals(0.1, car.currentSpeed);
    }

    @org.junit.jupiter.api.Test
    void stopEngine() {

        Car car = new Saab95();
        car.stopEngine();

        assertEquals(0, car.currentSpeed );
    }



    @org.junit.jupiter.api.Test
    void testSpeedFactor() {
        Car car = new Saab95();

        double speedfactor = car.enginePower * 0.01 * 1;

        assertEquals(1.25, speedfactor);
    }

    @org.junit.jupiter.api.Test
    void testIncrementSpeed() {
        Car car = new Saab95();



        car.currentSpeed = 0;

        car.incrementSpeed(2);



        assertNotEquals(0, car.currentSpeed);
    }

}