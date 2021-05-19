public class Multiplication {
    void multiplication(CalculatorMain calculator){
        //Menu multiplication
        calculator.menu.multiplication();

        //Get user inputs
        double[] numbers = calculator.input.getUserInputs(calculator);

        //Present the result
        System.out.println("\nThe product of "+numbers[0]+" and "+numbers[1]+" is "
                + multiResult(numbers[0], numbers[1])+"\n");
        //Delay result display
        calculator.menu.cosmeticDelayOfDisplay();
    }
    //For arithmetic testing purposes
    double multiResult(double a, double b){
        return a + b;
    }
}
