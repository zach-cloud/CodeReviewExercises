package project1.fixed;

import java.util.Scanner;

/**
 * Represents a simple calculator that can add, subtract, etc. two
 * numbers together. Uses the standard System.in and System.out.
 */
public class Calculator {

    /** Enumerates allowed operations. Must match exactly. */
    private static final String[] ALLOWED_OPERATIONS = {"+", "-", "*", "/", "^"};

    /**
     * Runs the calculator.
     * Prompts the user for an operation, and then asks
     * for two numbers to perform the operation on.
     */
    private void run() {
        Scanner in = new Scanner(System.in);
        String operation = getOperation(in);
        int firstNumber = getNumber(in);
        int secondNumber = getNumber(in);
        int result = performOperation(operation, firstNumber, secondNumber);
        System.out.println("Result: " + result);
    }

    /**
     * Runs the operation on the numbers.
     *
     * @param operation    Valid operation to run.
     * @param firstNumber  First number
     * @param secondNumber Second number
     * @return             Result of operation
     */
    private int performOperation(String operation, int firstNumber, int secondNumber) {
        switch (operation) {
            case "+":
                return firstNumber + secondNumber;
                // Break not needed, since we return here.
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            case "/":
                return firstNumber / secondNumber;
            case "^":
                return (int)Math.pow(firstNumber, secondNumber);
            default:
                throw new IllegalArgumentException("Not an operation: " + operation);
        }
    }

    /**
     * Gets a number from the user.
     * Correctly handles not-a-number cases by asking again.
     *
     * @param in Scanner linked to System.in
     * @return   Number entered by user
     */
    private int getNumber(Scanner in) {
        boolean numberProvided = false;
        int number = 0;
        while(!numberProvided) {
            try {
                System.out.print("Enter a number: ");
                number = Integer.parseInt(in.nextLine());
                numberProvided = true;
            } catch (NumberFormatException ex) {
                System.out.println("Not a number!");
            }
        }
        return number;
    }

    /**
     * Gets a valid operation from the user.
     *
     * @param in Scanner linked to System.in
     * @return   Operation entered by user
     */
    private String getOperation(Scanner in) {
        String operation = "";
        while(!isValidOperation(operation)) {
            System.out.print("Enter an operation: " + getValidOperationsString());
            operation = in.nextLine();
        }
        return operation;
    }

    /**
     * Creates a String representation of all allowed operations
     *
     * @return  Allowed operations, in a user-friendly format
     */
    private String getValidOperationsString() {
        StringBuilder operationsString = new StringBuilder("(");
        for(String operation : ALLOWED_OPERATIONS) {
            operationsString.append(operation).append(",");
        }
        if(operationsString.length() > 2) {
            // Remove last comma
            operationsString.setLength(operationsString.length()-1);
        }
        operationsString.append(")");
        return operationsString.toString();
    }

    /**
     * Determines if the entered operation is valid or not.
     *
     * @param operation Operation to check
     * @return          True if valid; false if not.
     */
    private boolean isValidOperation(String operation) {
        for(String allowedOperation : ALLOWED_OPERATIONS) {
            if(operation.equalsIgnoreCase(allowedOperation)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Program entry point.
     * Runs the calculator app, performing a simple
     * operation on two numbers.
     *
     * @param args  Ignored
     */
    public static void main(String[] args) {
        new Calculator().run();
    }
}
