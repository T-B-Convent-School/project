import java.util.Scanner;

/**
 * Main class to run the calculator app.
 * Handles user input/output and calls Calculator methods.
 */
public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Calculator instance to perform operations
        Calculator calc = new Calculator();

        System.out.println("Simple Calculator");
        System.out.println("Select operation:");
        System.out.println("1. Add (+)");
        System.out.println("2. Subtract (-)");
        System.out.println("3. Multiply (*)");
        System.out.println("4. Divide (/)");

        // Prompt user to choose an operation
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        // Input two numbers for calculation
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;

        // Call proper Calculator method depending on operation choice
        switch (choice) {
            case 1:
                result = calc.add(num1, num2);
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                result = calc.subtract(num1, num2);
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
            case 3:
                result = calc.multiply(num1, num2);
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
            case 4:
                result = calc.divide(num1, num2);
                if (num2 != 0) {
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                }
                break;
            default:
                System.out.println("Invalid choice. Please select between 1 and 4.");
        }

        // Close scanner resource
        scanner.close();
    }
}
