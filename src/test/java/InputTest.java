import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class InputTest {
    //Class variables and objects
    Input inputTest = new Input();


    @Test
    void getInputString() {
        //Asserts
        assertEquals("TestWithSpace",
                inputTest.getInputString(new ByteArrayInputStream("  TestWithSpace  \n".getBytes())),
                "Test spaces before and after, trim() method");

        assertEquals("#¤5678GHJkl öpÅÖÄ",
                inputTest.getInputString(new ByteArrayInputStream("#¤5678GHJkl öpÅÖÄ\n".getBytes())),
                "Test all kind of characters");
    }

    @Test
    void parseInput() {

        //Asserts
        assertEquals(123.4560,
                inputTest.parseInput(new ByteArrayInputStream("  123.4560 \n".getBytes())),
                "Test spaces before and after, trim() method and parseDouble");

        //picking up easter egg
        double easterEgg = inputTest.parseInput(new ByteArrayInputStream("MARCUS\n".getBytes()));
        assertEquals(42, easterEgg, "Test of easter egg MARCUS");

        //NumberFormatException throws
        assertThrows(NumberFormatException.class, () -> {
            inputTest.parseInput(new ByteArrayInputStream("Test\n".getBytes()));
        });
    }

    @Test
    void getUserInputs(){
        //double[] numbers;
        //numbers = inputTest.getUserInputs(new CalculatorMain(), new ByteArrayInputStream("25\n".getBytes()));
        //assertEquals(25, numbers[0]);
        //Exception handling
        //numbers = inputTest.getUserInputs(new CalculatorMain(), new ByteArrayInputStream("1\n".getBytes()));
        //assertFalse(inputTest.valid);
        //inputTest.getUserInputs(new CalculatorMain(), new ByteArrayInputStream("1\n".getBytes()));
    }
}