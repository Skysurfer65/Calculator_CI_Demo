import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest extends DivisionTest {
    //Class variables and objects
    Multiplication multiplicationTest = new Multiplication();

    @Test
    void multiResult() {
        //Asserts
        //Due to using doubles program will round off to two decimals and therefore delta value
        double delta = 0.0049;
        assertEquals(2436, multiplicationTest.multiResult(42, 58), delta, "Test with two doubles");
        assertEquals(-2436, multiplicationTest.multiResult(-42, 58), delta,"Test with two doubles, one is negative");
        assertEquals(-0.013375, multiplicationTest.multiResult(0.005, -2.675), delta,"Test with two decimal numbers, one is negative");
        //Test with easter egg
        double easterEgg = inputTest.parseInput(new ByteArrayInputStream("MARCUS\n".getBytes()));
        assertEquals(-1764, multiplicationTest.multiResult(easterEgg, -42), delta, "Test with easter egg" );
    }
}