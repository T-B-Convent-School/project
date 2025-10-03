/**
 * Calculator class provides basic arithmetic operations.
 * This keeps operation logic separate from UI/input handling.
 */
public class Calculator {

    /**
     * Adds two numbers.
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts second number from the first.
     * @param a first number
     * @param b second number
     * @return result of a minus b
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     * @param a first number
     * @param b second number
     * @return product of a and b
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides first number by second, with zero check.
     * Returns 0 and prints error if dividing by zero.
     * @param a numerator
     * @param b denominator
     * @return quotient if valid, else 0
     */
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }
}
