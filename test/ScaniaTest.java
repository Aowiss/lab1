import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScaniaTest {

    @Test
    void isMoving() {
        Scania scania = new Scania();

        scania.startEngine();

        assertEquals(true, scania.isMoving());
    }

    @Test
    void platformRaise() {
    }

    @Test
    void platformLower() {
        Scania scania = new Scania();
        scania.platformAngle = 70;

        scania.platformLower(60);


        assertEquals(10, scania.platformAngle);
    }

    @Test
    void isPlatformraised() {
        Scania scania = new Scania();

        scania.startEngine();
        scania.platformAngle = 2;
        scania.isPlatformraised();


        assertEquals(0, scania.getCurrentSpeed());
    }
}