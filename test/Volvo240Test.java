import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class Volvo240Test {

    @org.junit.jupiter.api.Test
    void getCurrentSpeed() {
        Volvo240 Volvo240 = new Volvo240();
        Volvo240.enginePower = 23;
        assertEquals(0, Volvo240.getCurrentSpeed());
    }

    @org.junit.jupiter.api.Test
    void speedFactor() {
        Volvo240 Volvo240 = new Volvo240();
        assertEquals(1.25, Volvo240.speedFactor());
    }

    @org.junit.jupiter.api.Test
    void incrementSpeed() {
        Volvo240 Volvo240 = new Volvo240();
        assertEquals(0, Volvo240.getCurrentSpeed());
    }

    @org.junit.jupiter.api.Test
    void decrementSpeed() {
        Volvo240 Volvo240 = new Volvo240();
        assertEquals(0,Volvo240.getCurrentSpeed());
    }



    @org.junit.jupiter.api.Test
    void testspeedonbrake(){
        Volvo240 Volvo240 = new Volvo240();
        for(int i = 0; i<200; i++){
            Volvo240.brake(1);

        }
        assertEquals(true, 0 <= Volvo240.currentSpeed  && Volvo240.currentSpeed <= Volvo240.enginePower);
    }
    @org.junit.jupiter.api.Test
    void testspeedongas(){
        Volvo240 Volvo240 = new Volvo240();
        for(int i = 0; i<200; i++){
            Volvo240.gas(1);


        }
        assertEquals(true, 0 <= Volvo240.currentSpeed && Volvo240.currentSpeed <= Volvo240.enginePower);
    }



    @org.junit.jupiter.api.Test
    void move() {

        Volvo240 Volvo240 = new Volvo240();
        Volvo240.startEngine();

        Volvo240.move();


        assertEquals(0.1, Volvo240.GetY());

        Volvo240.startEngine();

        Volvo240.turnLeft();

        Volvo240.move();

        assertEquals(-0.1, Volvo240.GetX());

        Volvo240.startEngine();

        Volvo240.turnLeft();

        Volvo240.move();
        Volvo240.move();

        assertEquals(-0.1, Volvo240.GetY());


        Volvo240.startEngine();
        Volvo240.turnLeft();

        Volvo240.move();
        Volvo240.move();
        assertEquals(0.1, Volvo240.GetX());
    }

    @org.junit.jupiter.api.Test
    void turnLeft() {
        Volvo240 Volvo240 = new Volvo240();
        Volvo240.turnLeft();
        assertEquals(Directions.West, Volvo240.getDirections());
        Volvo240.turnLeft();
        assertEquals(Directions.South,Volvo240.getDirections());
        Volvo240.turnLeft();
        assertEquals(Directions.East, Volvo240.getDirections());
        Volvo240.turnLeft();
        assertEquals(Directions.North, Volvo240.getDirections());
    }

    @org.junit.jupiter.api.Test
    void turnRight() {
        Volvo240 Volvo240 = new Volvo240();
        Volvo240.turnRight();
        assertEquals(Directions.East, Volvo240.getDirections());
        Volvo240.turnRight();
        assertEquals(Directions.South,Volvo240.getDirections());
        Volvo240.turnRight();
        assertEquals(Directions.West, Volvo240.getDirections());
        Volvo240.turnRight();
        assertEquals(Directions.North, Volvo240.getDirections());
    }

    @org.junit.jupiter.api.Test
    void getNrDoors() {
        Volvo240 Volvo240 = new Volvo240();

        assertEquals(4, Volvo240.getNrDoors());
    }

    @org.junit.jupiter.api.Test
    void getEnginePower() {
        Volvo240 Volvo240 = new Volvo240();
        assertEquals(100, Volvo240.getEnginePower());
    }



    @org.junit.jupiter.api.Test
    void getColor() {
        Volvo240 Volvo240 = new Volvo240();

        assertEquals(Color.black, Volvo240.getColor());
    }

    @org.junit.jupiter.api.Test
    void setColor() {
        Volvo240 Volvo240 = new Volvo240();

        Color color =  Volvo240.setColor(Color.black);

        assertEquals(Color.black, color);



    }

    @org.junit.jupiter.api.Test
    void testStartEngine() {

        Volvo240 Volvo240 = new Volvo240();

        Volvo240.startEngine();

        assertEquals(0.1, Volvo240.currentSpeed);
    }

    @org.junit.jupiter.api.Test
    void stopEngine() {

        Volvo240 Volvo240 = new Volvo240();
        Volvo240.stopEngine();

        assertEquals(0, Volvo240.currentSpeed );
    }



    @org.junit.jupiter.api.Test
    void testSpeedFactor() {
        Volvo240 Volvo240 = new Volvo240();

        double speedfactor = Volvo240.enginePower * 0.01 * 1.25;

        assertEquals(1.25, speedfactor);
    }

    @org.junit.jupiter.api.Test
    void testIncrementSpeed() {
        Volvo240 Volvo240 = new Volvo240();

        double amount = 2;

        Volvo240.currentSpeed = 0;

        double speedfactor = 1.25;

        Volvo240.incrementSpeed(2);

        assertNotEquals(0, Volvo240.currentSpeed + speedfactor* amount);
    }
}