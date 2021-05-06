import java.text.DecimalFormat;

public class Subtraction {
    void subtraction(CalculatorMain calculator){
        //Menu subtraction
        calculator.menu.subtraction();

        //Get user inputs
        double[] numbers = calculator.input.getUserInputs(calculator);

        //Round off to two decimals and present answer
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("\nThe difference between "+numbers[0]+" and "+numbers[1]+" is "
                +df.format(subResult(numbers[0], numbers[1])));
        System.out.println("Rounded off to two decimals");
        //Delay result display
        calculator.menu.cosmeticDelayOfDisplay();
    }
    //For arithmetic testing purposes
    double subResult(double a, double b){
        return a - b;
    }
}
