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
    void gas() {

    }

    @org.junit.jupiter.api.Test
    void brake() {
    }

    @org.junit.jupiter.api.Test
    void move() {
    }

    @org.junit.jupiter.api.Test
    void turnLeft() {
        Saab95 sab = new Saab95();
        sab.turnLeft();
        assertEquals(Directions.West, sab.getDirections());
    }

    @org.junit.jupiter.api.Test
    void turnRight() {
        Saab95 sab = new Saab95();
        sab.turnRight();
        assertEquals(Directions.East, sab.getDirections());
    }

    @org.junit.jupiter.api.Test
    void getNrDoors() {
    }

    @org.junit.jupiter.api.Test
    void getEnginePower() {
    }

    @org.junit.jupiter.api.Test
    void testGetCurrentSpeed() {
    }

    @org.junit.jupiter.api.Test
    void getColor() {
    }

    @org.junit.jupiter.api.Test
    void setColor() {
    }

    @org.junit.jupiter.api.Test
    void startEngine() {
    }

    @org.junit.jupiter.api.Test
    void stopEngine() {
    }

    @org.junit.jupiter.api.Test
    void setTurboOn() {
    }

    @org.junit.jupiter.api.Test
    void setTurboOff() {
    }

    @org.junit.jupiter.api.Test
    void testSpeedFactor() {
    }

    @org.junit.jupiter.api.Test
    void testIncrementSpeed() {
    }

    @org.junit.jupiter.api.Test
    void testDecrementSpeed() {
    }

    @org.junit.jupiter.api.Test
    void testGas() {
    }

    @org.junit.jupiter.api.Test
    void testBrake() {
    }
}