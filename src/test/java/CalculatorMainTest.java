import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorMainTest{
    //Class variables and objects


    //Test arithmetics
    @Test
    void addition(){
        AdditionTest test = new AdditionTest();
        test.addResult();
    }
    @Test
    void subtraction(){
        SubtractionTest test = new SubtractionTest();
        test.subResult();
    }
    @Test
    void division(){
        DivisionTest test = new DivisionTest();
        test.divResult();
    }
    @Test
    void multiplication() {
        MultiplicationTest test = new MultiplicationTest();
        test.multiResult();
    }
    @Test
    void tempCalculation(){
        TempCalculationsTest test = new TempCalculationsTest();
        test.cToFResult();
        test.fToCResult();
    }
    @Test
    void input(){
        InputTest test = new InputTest();
        test.getInputString();
        test.parseInput();
        test.getUserInputs();
    }
}