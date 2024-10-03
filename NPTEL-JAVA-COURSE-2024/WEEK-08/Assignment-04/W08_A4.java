// Import of pre-defined package java.util and class Scanner
// Complete the code segment to execute the following program successfully.
// You should import the correct package(s) and/or class(s) to complete the code.

import static java.lang.System.*;
import java.util.Scanner;
// main class is created

public class W08_A4 {

    public static void main(String[] args) {
        // Scanner object is created
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Course Name: ");
        // Read String input using scanner class
        String courseName = scanner.nextLine();
        // Print the scanned String
        out.print("Course is : " + courseName);
    }
}
