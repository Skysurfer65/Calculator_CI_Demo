import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest extends DivisionTest {
    //Class variables and objects
    Multiplication multiplicationTest = new Multiplication();

    @Test
    void multiResult() {
        //Arrange
        Scanner old = inputTest.scan;

        //Act
        inputTest.scan = new Scanner(new ByteArrayInputStream("MARCUS\n".getBytes()));
        double easterEgg = inputTest.parseInput();
        //Due to using doubles program will round off to two decimals and therefore delta value
        double delta = 0.0049;

        //Asserts
        assertEquals(2436, multiplicationTest.multiResult(42, 58), delta, "Test with two doubles");
        assertEquals(-2436, multiplicationTest.multiResult(-42, 58), delta,"Test with two doubles, one is negative");
        assertEquals(-0.013375, multiplicationTest.multiResult(0.005, -2.675), delta,"Test with two decimal numbers, one is negative");
        //Test with easter egg
        assertEquals(-1764, multiplicationTest.multiResult(easterEgg, -42), delta, "Test with easter egg" );

        inputTest.scan = old;
    }
}