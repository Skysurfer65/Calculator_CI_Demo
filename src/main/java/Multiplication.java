public class Multiplication {
    void multiplication(CalculatorMain calculator){
        //Menu multiplication
        calculator.menu.multiplication();

        //Get user inputs
        double[] numbers = calculator.input.getUserInputs(calculator, System.in);

        //Present the result
        System.out.println("\nThe product of "+numbers[0]+" and "+numbers[1]+" is "
                + multiResult(numbers[0], numbers[1])+"\n");
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
    double multiResult(double a, double b){
        return a * b;
    }
}
