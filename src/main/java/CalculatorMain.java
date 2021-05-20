public class CalculatorMain {
    //Class objects and variables
    Menues menu = new Menues();
    Input input = new Input();
    String value;

    public static void main(String[] args) {
        CalculatorMain calculator = new CalculatorMain();
        System.out.println(calculator.menu.wellcome());

        boolean valid = true;
        do {
            System.out.print(calculator.menu.options());
            calculator.value = calculator.input.getInputString().toUpperCase();
            switch (calculator.value){
                case "+":
                    Addition addition = new Addition();
                    addition.addition(calculator);
                    break;
                case "-":
                    Subtraction subtraction = new Subtraction();
                    subtraction.subtraction(calculator);
                    break;
                case "/":
                    Division division = new Division();
                    division.division(calculator);
                    break;
                case "*":
                    Multiplication multiplication = new Multiplication();
                    multiplication.multiplication(calculator);
                    break;
                case "C":
                    TempCalculations tempCalculations = new TempCalculations();
                    tempCalculations.celsiusToFahrenheit(calculator);
                    break;
                case "F":
                    tempCalculations = new TempCalculations();
                    tempCalculations.fahrenheitToCelsius(calculator);
                    break;
                case "QUIT":
                    valid = false;
                    break;
                default:
                    calculator.menu.invalidInputs();
                    break;
            }
        }while(valid);

        System.out.println("By by, see you next time :-)");
    }
}
