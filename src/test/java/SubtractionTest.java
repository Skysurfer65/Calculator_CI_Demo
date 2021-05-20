
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionTest{
    //Class variables and objects
    Input inputTest = new Input();
    Subtraction subtractionTest;

    @Test
    void subResult() {
        //Arrange
        subtractionTest = new Subtraction();
        Scanner old = inputTest.scan;

        //Act
        inputTest.scan = new Scanner(new ByteArrayInputStream("MARCUS\n".getBytes()));
        double easterEgg = inputTest.parseInput();
        //Asserts
        //Due to using doubles program will round off to two decimals and therefore delta value
        double delta = 0.0049;
        assertEquals(-16, subtractionTest.subResult(42, 58), delta,"Test with two doubles");
        assertEquals(-100, subtractionTest.subResult(-42, 58), delta,"Test with two doubles, one is negative");
        assertEquals(2.68, subtractionTest.subResult(0.005, -2.675), delta,"Test with two decimal numbers, one is negative");
        //Test with easter egg
        assertEquals(84, subtractionTest.subResult(easterEgg, -42), delta, "Test with easter egg" );

        inputTest.scan = old;
    }
    @Test
    void subtractionMenu(){
        //Arrange
        Menues menu = new Menues();
        //Act
        String text = menu.subtraction();
        //Asserts
        assertTrue(text.contains("******** Subtraction ********"));
    }
}