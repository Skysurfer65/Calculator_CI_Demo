import java.text.DecimalFormat;


public class Addition {

    void addition(CalculatorMain calculator) {
        //Menu addition
        calculator.menu.addition();

        //Get user inputs
        double[] numbers = calculator.input.getUserInputs(calculator);

        //Round off to two decimals and present
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("\nThe sum of "+numbers[0]+" and "+numbers[1]+" is "
                +df.format(addResult(numbers[0], numbers[1]))+"\n");
        //Delay display of result
        calculator.menu.cosmeticDelayOfDisplay();
    }
    //For arithmetic testing purposes
    double addResult(double a, double b){
        return a + b;
    }
}
