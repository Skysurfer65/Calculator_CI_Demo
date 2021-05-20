public class Menues {
    String text;

    String wellcome(){
        text = "\n\n*****************************************\n";
        text+= "Wellcome to my calculator and temperature\n";
        text+= "converter!\n";
        text+= "*****************************************\n\n";
        return text;
    }
    String options(){
        text = "You can choose from the following options:\n";
        text+= "+ for addition\n- for subtraction\n/ for division\n* for multiplication\n\n";
        text+= "You can also choose a temperature converter\n";
        text+= "between Celsius and Fahrenheit by choosing:\n";
        text+= "C for Celsius to Fahrenheit or\n";
        text+= "F for Fahrenheit to Celsius\n\n";
        text+= "If you want to quit write: quit\n";
        text+= "Please type your request: ";
        return text;
    }
    String invalidInputs(){
        text = "\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n";
        text+= "Invalid inputs, try again....\n";
        text+= "!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n\n";
        return text;
    }
    String addition(){
        text = "\n******** Addition ********\n";
        text+= "Enter two numbers to add,\n";
        text+= "press enter after each input\n";
        return text;
    }
    String subtraction(){
        text = "\n******** Subtraction ********\n";
        text+= "Enter two numbers to subtract,\n";
        text+= "press enter after each input\n";
        return text;
    }
    String division(){
        text = "\n******** Division ********\n";
        text+= "Enter two numbers to divide,\n";
        text+= "press enter after each input\n";
        return text;
    }
    String multiplication(){
        text = "\n******* Multiplication *******\n";
        text+= "Enter two numbers to multiply,\n";
        text+= "press enter after each input\n";
        return text;
    }
    String celsiusToFahrenheit(){
        text = "\n****** Temp conversions ******\n";
        text+= "Convert degrees of Celsius to\n";
        text+= "degrees of Fahrenheit\n";
        return text;
    }
    String fahrenheitToCelsius(){
        text = "\n****** Temp conversions ******\n";
        text+= "Convert degrees of Fahrenheit to\n";
        text+= "degrees of Celsius\n";
        return text;
    }
    void cosmeticDelayOfDisplay(){
        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        //Cosmetic end line of calculation
        text = "*****************************************";
        System.out.println(text);
    }
}
