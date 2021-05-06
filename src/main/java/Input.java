import java.io.InputStream;
import java.util.Scanner;

public class Input {
    //Class variable and objects
    Scanner scan = new Scanner(System.in);

    String getInputString(){
        //Trim empty spaces before and after
        return scan.nextLine().trim();
    }

    double parseInput(){
        String input = getInputString();
        //Easter egg MARCUS == 42
        if(input.equals("MARCUS"))return 42;
        return Double.parseDouble(input);
    }

    double[] getUserInputs(CalculatorMain calculator) throws NumberFormatException{
        double a = 0, b = 0;
        boolean valid;
        do {
            System.out.print("Enter your first number: ");
            try {
               a = parseInput();
                valid = true;
            } catch (NumberFormatException e){
                calculator.menu.invalidInputs();
                valid = false;
            }
        }while(!valid);
        do {
            System.out.print("Enter your second number: ");
            try {
                b = parseInput();
                //Check if dividing by Zero
                if(b == 0 && calculator.value.equals("/")){
                    System.out.println("!!! You can't divide by ZERO !!!");
                    valid = false;
                }else valid = true;
            } catch (NumberFormatException e){
                calculator.menu.invalidInputs();
                valid = false;
            }
        }while(!valid);
        double[] numbers = {a, b};
        return numbers;
    }
}
