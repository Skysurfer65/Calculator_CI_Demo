import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest extends SubtractionTest {
    //Class variables and objects
    Division divisionTest;

    @Test
    void divResult() {
        //Arrange
        divisionTest = new Division();
        double divZero;

        //Act
        inputTest.scan = new Scanner(new ByteArrayInputStream("MARCUS\n".getBytes()));
        double easterEgg = inputTest.parseInput();
        //Due to using doubles program will round off to two decimals and therefore delta value
        double delta = 0.0049;

        //Asserts
        assertEquals(0.72, divisionTest.divResult(42, 58), delta, "Test with two doubles");
        assertEquals(-0.72, divisionTest.divResult(-42, 58), delta, "Test with two doubles, one is negative");
        assertEquals(0, divisionTest.divResult(0.005, -2.675), delta,"Test with two decimal numbers, one is negative");
        //Test with easter egg
        assertEquals(-1, divisionTest.divResult(easterEgg, -42), delta, "Test with easter egg" );
        //Divided by Zero
        divZero = divisionTest.divResult(10, 0);
        assertEquals(Double.POSITIVE_INFINITY, divZero);
        divZero = divisionTest.divResult(-10, 0);
        assertEquals(Double.NEGATIVE_INFINITY, divZero);
    }
}