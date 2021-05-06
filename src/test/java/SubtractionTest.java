import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionTest extends AdditionTest {
    //Class variables and objects
    Subtraction subtractionTest;

    @BeforeEach
    void setupEach(){
    }

    @Test
    void subResult() {
        subtractionTest = new Subtraction();
        //Asserts
        //Due to using doubles program will round off to two decimals and therefore delta value
        double delta = 0.0049;
        assertEquals(-16, subtractionTest.subResult(42, 58), delta,"Test with two doubles");
        assertEquals(-100, subtractionTest.subResult(-42, 58), delta,"Test with two doubles, one is negative");
        assertEquals(2.68, subtractionTest.subResult(0.005, -2.675), delta,"Test with two decimal numbers, one is negative");
        //Test with easter egg
        double easterEgg = inputTest.parseInput(new ByteArrayInputStream("MARCUS\n".getBytes()));
        assertEquals(84, subtractionTest.subResult(easterEgg, -42), delta, "Test with easter egg" );
    }
}