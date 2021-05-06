import java.text.DecimalFormat;

public class TempCalculations {
    //Fahrenheit  = (Celsius x 1.8) + 32
    void celsiusToFahrenheit(CalculatorMain calculator){
        //Menu Celsius to Fahrenheit
        calculator.menu.celsiusToFahrenheit();

        //Get user input
        double celsius = 0;
        boolean valid;
        do {
            System.out.print("Enter degrees of Celsius: ");
            try {
                celsius = calculator.input.parseInput();
                valid = true;
            } catch (Exception e){
                calculator.menu.invalidInputs();
                valid = false;
            }
        }while(!valid);

        //Round off to one decimal and present result
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("\n"+celsius+" degrees Celsius is equal to "
                +df.format(cToFResult(celsius))+" degrees Fahrenheit\n");
        //Delay result display
        calculator.menu.cosmeticDelayOfDisplay(3);
    }
    //For arithmetic testing purposes
    double cToFResult(double celsius){
        return (celsius * 1.8) + 32;
    }

    void fahrenheitToCelsius(CalculatorMain calculator){
        //Menu Fahrenheit to Celsius
        calculator.menu.fahrenheitToCelsius();

        //Get user input
        double fahrenheit = 0;
        boolean valid;
        do {
            System.out.print("Enter degrees of Fahrenheit: ");
            try {
                fahrenheit = calculator.input.parseInput();
                valid = true;
            } catch (Exception e){
                calculator.menu.invalidInputs();
                valid = false;
            }
        }while(!valid);

        //Round off to one decimal and present result
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("\n"+fahrenheit+" degrees Fahrenheit is equal to "
                +df.format(fToCResult(fahrenheit))+" degrees Celsius\n");
        //Delay result display
        calculator.menu.cosmeticDelayOfDisplay(3);
    }
    //For arithmetic testing purposes
    double fToCResult(double fahrenheit){
        return (fahrenheit - 32) / 1.8;
    }
}
