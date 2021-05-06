import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest extends InputTest {
    //Class variables and objects
    Addition additionTest;

    @BeforeEach
    void setupEach(){
    }

    @Test
    void addResult() {
        additionTest = new Addition();
        //Asserts
        //Due to using doubles program will round off to two decimals and therefore delta value
        double delta = 0.0049;
        assertEquals(100, additionTest.addResult(42, 58), delta,"Test with two doubles");
        assertEquals(16, additionTest.addResult(-42, 58), delta, "Test with two doubles, one is negative");
        assertEquals(-2.67, additionTest.addResult(0.005, -2.675), delta, "Test with two decimal numbers, one is negative");
        assertEquals(2.68, additionTest.addResult(0.005, 2.675), delta, "Test with two decimal numbers");
        //Test with easter egg
        double easterEgg = inputTest.parseInput(new ByteArrayInputStream("MARCUS\n".getBytes()));
        assertEquals(100, additionTest.addResult(easterEgg, 58), delta, "Test with easter egg" );

    }
}