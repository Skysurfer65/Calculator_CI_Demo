import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest extends InputTest {
    //Class variables and objects
    Addition additionTest;

    @Test
    void addResult() {
        //Arrange
        additionTest = new Addition();
        Scanner old = inputTest.scan;

        //Act
        inputTest.scan = new Scanner(new ByteArrayInputStream("MARCUS\n".getBytes()));
        double easterEgg = inputTest.parseInput();

        //Asserts
        //Due to using doubles program will round off to two decimals and therefore delta value
        double delta = 0.0049;
        assertEquals(100, additionTest.addResult(42, 58), delta,"Test with two doubles");
        assertEquals(16, additionTest.addResult(-42, 58), delta, "Test with two doubles, one is negative");
        assertEquals(-2.67, additionTest.addResult(0.005, -2.675), delta, "Test with two decimal numbers, one is negative");
        assertEquals(2.68, additionTest.addResult(0.005, 2.675), delta, "Test with two decimal numbers");
        //Test with easter egg
        assertEquals(100, additionTest.addResult(easterEgg, 58), delta, "Test with easter egg" );

        inputTest.scan = old;
    }

    @Test
    void additionMenu(){
        //Arrange
        //additionTest = new Addition();
        //Scanner old = inputTest.scan;
        CalculatorMain calculatorTest = new CalculatorMain();
        SystemOutRule systemOutLog = new SystemOutRule().enableLog();


        //Act

        //calculatorTest.menu.addition();
        //assertFalse(systemOutLog.getLog().contains("******** Addition ********"));
        //inputTest.scan = new Scanner(new ByteArrayInputStream("MARCUS\n42\n".getBytes()));

        //Asserts

        //System.exit(1);
        //assertEquals("hello world", systemOutLog.getLog());
        //assertEquals(42, additionTest.numbers[0], "Checking MARCUS");
        //assertEquals(42, additionTest.numbers[1], "Checking second input");

        //inputTest.scan = old;
    }
}