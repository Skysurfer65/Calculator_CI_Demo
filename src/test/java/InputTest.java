import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;


import static org.junit.jupiter.api.Assertions.*;

class InputTest {
    //Class variables and objects
    Input inputTest = new Input();


    @Test
    void getInputString() {
        //Arrange
        Scanner old = inputTest.scan;

        //Act
        inputTest.scan = new Scanner(new ByteArrayInputStream("  TestWithSpace  \n".getBytes()));
        //Asserts
        assertEquals("TestWithSpace", inputTest.getInputString(), "Test spaces before and after, trim() method");

        //Act
        inputTest.scan = new Scanner(new ByteArrayInputStream("#¤5678GHJkl öpÅÖÄ\n".getBytes()));
        //Asserts
        assertEquals("#¤5678GHJkl öpÅÖÄ", inputTest.getInputString(), "Test all kind of characters with space in middle");

        inputTest.scan = old;
    }

    @Test
    void parseInput() {
        //Arrange
        Scanner old = inputTest.scan;

        //Act
        inputTest.scan = new Scanner(new ByteArrayInputStream("  123.4560  \n".getBytes()));
        //Asserts
        assertEquals(123.4560,
                inputTest.parseInput(),
                "Test spaces before and after, trim() method and parseDouble");

        //picking up easter egg
        //Act
        inputTest.scan = new Scanner(new ByteArrayInputStream("MARCUS\n".getBytes()));
        double easterEgg = inputTest.parseInput();
        //Assert
        assertEquals(42, easterEgg, "Test of easter egg MARCUS");

        //NumberFormatException throws
        //Act
        inputTest.scan = new Scanner(new ByteArrayInputStream("Test\n".getBytes()));
        //Assert
        assertThrows(NumberFormatException.class, () -> { inputTest.parseInput(); });

        inputTest.scan = old;
    }

    @Test
    void getUserInputs(){
        //Arrange
        Scanner old = inputTest.scan;
        CalculatorMain testCalculator = new CalculatorMain();
        double[] numbers;
        //Act
        inputTest.scan = new Scanner(new ByteArrayInputStream("25\nMARCUS\n".getBytes()));
        numbers = inputTest.getUserInputs(new CalculatorMain());
        //Assert
        assertEquals(25, numbers[0], "First user input");
        assertEquals(42, numbers[1], "Second user input");

        //Exception handling
        //Act
        inputTest.scan = new Scanner(new ByteArrayInputStream("25\nmarcus\nMARCUS\n".getBytes()));
        numbers = inputTest.getUserInputs(testCalculator);
        //Assert
        assertEquals(42, numbers[1], "Check easter egg MARCUS after exception handling");

        //Divide by zero
        //Act
        testCalculator.value = "/";
        inputTest.scan = new Scanner(new ByteArrayInputStream("25\n0\nMARCUS\n".getBytes()));
        numbers = inputTest.getUserInputs(testCalculator);
        //Assert
        assertEquals(42, numbers[1], "Check easter egg MARCUS after exception handling, divide by 0");

        inputTest.scan = old;
    }
}