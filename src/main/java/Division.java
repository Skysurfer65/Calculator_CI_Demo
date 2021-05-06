import java.text.DecimalFormat;

public class Division {
    void division(CalculatorMain calculator){
        //Menu division
        calculator.menu.division();

        //Get user inputs
        double[] numbers = calculator.input.getUserInputs(calculator, System.in);

        //Round off quota to two decimals and display
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("\nThe quota between "+numbers[0]+" and "+numbers[1]+" is "
                +df.format(divResult(numbers[0], numbers[1])));
        System.out.println("Rounded off to two decimals\n");
        //Delay result display
        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        //Cosmetic end line of calculation
        System.out.println("*****************************************");
    }
    //For arithmetic testing purposes
    double divResult(double a, double b) { return a / b; }
}
