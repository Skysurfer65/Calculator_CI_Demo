import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorMainTest{
    //Test Mainpage menues
    @Test
    void wellcome(){
        //Arrange
        Menues menu = new Menues();
        //Act
        String text = menu.wellcome();
        //Asserts
        assertTrue(text.contains("Wellcome"));
    }
    @Test
    void options(){
        //Arrange
        Menues menu = new Menues();
        //Act
        String text = menu.options();
        //Asserts
        assertTrue(text.contains("options"));
    }

    //Test arithmetics
    @Test
    void addition(){
        AdditionTest test = new AdditionTest();
        test.addResult();
        test.additionMenu();
    }
    @Test
    void subtraction(){
        SubtractionTest test = new SubtractionTest();
        test.subResult();
        test.subtractionMenu();
    }
    @Test
    void division(){
        DivisionTest test = new DivisionTest();
        test.divResult();
        test.divisionMenu();
    }
    @Test
    void multiplication() {
        MultiplicationTest test = new MultiplicationTest();
        test.multiResult();
        test.multiplicationMenu();
    }
    @Test
    void tempCalculation(){
        TempCalculationsTest test = new TempCalculationsTest();
        test.cToFResult();
        test.fToCResult();
        test.celsiusToFahrenheitMenu();
        test.fahrenheitToCelsiusMenu();
    }
    @Test
    void input(){
        InputTest test = new InputTest();
        test.getInputString();
        test.parseInput();
        test.getUserInputs();
        test.invalidInputsMenu();
    }
}