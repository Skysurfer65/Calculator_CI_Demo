import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TempCalculationsTest{
    //Class object
    TempCalculations tempCalculationsTest = new TempCalculations();

    @Test
    void cToFResult() {
        //Act
        //Due to using doubles program will round off to one decimal and therefore delta value
        double delta = 0.049;

        //Asserts
        assertEquals(32, tempCalculationsTest.cToFResult(0),delta, "0 degree C to F");
        assertEquals(212, tempCalculationsTest.cToFResult(100), delta,"100 degrees C to F");
        assertEquals( 77, tempCalculationsTest.cToFResult(25), delta,"25 degrees C to F");
        assertEquals( -40, tempCalculationsTest.cToFResult(-40), delta, "-40 degrees C to F");
    }

    @Test
    void fToCResult() {
        //Act
        //Due to using doubles program will round off to one decimal and therefore delta value
        double delta = 0.049;

        //Asserts
        assertEquals(-17.8, tempCalculationsTest.fToCResult(0),delta, "0 degree F to C");
        assertEquals(37.8, tempCalculationsTest.fToCResult(100), delta, "100 degrees F to C");
        assertEquals( -3.9, tempCalculationsTest.fToCResult(25), delta, "25 degrees F to C");
        assertEquals( -40, tempCalculationsTest.fToCResult(-40), delta, "-40 degrees F to C");
    }
}