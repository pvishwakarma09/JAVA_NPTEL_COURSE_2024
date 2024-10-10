// Complete the code below with a catch statement to print the following if the denominator (b) is zero
// print “Cannot Divide by ZERO”

import java.util.Scanner;

public class W10_A5 {

    public static void main(String[] args) {
        int a, b;  // Declare two integers for input

        // Create a scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number (a): ");
        a = input.nextInt();  // Read the first number

        System.out.print("Enter the second number (b): ");
        b = input.nextInt();  // Read the second number

        input.close();  // Close the scanner to prevent resource leaks

        int result;  // Variable to store the result of a / b

        // Try block to divide two numbers and display the result
        try {
            result = a / b;  // Perform division
            System.out.println("Result of a / b: " + result);  // Print the result
        } // Catch block to handle division by zero
        catch (ArithmeticException e) {
            System.out.println("Cannot Divide by ZERO");  // Print error if b is 0
        } // Catch block to handle any other exceptions
        catch (Exception e) {
            System.out.println("Exception Occurred");  // Print generic error message
        }
    }
}
