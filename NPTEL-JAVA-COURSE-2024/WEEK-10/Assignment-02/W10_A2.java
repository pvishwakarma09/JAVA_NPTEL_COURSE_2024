/*
A byte char array is initialized.
You have to enter an index value "n".
According to index your program will print the byte and its corresponding char value.
Complete the code segment to catch the exception in the following, if any.
On the occurrence of such an exception, your program should print “Error: Exception occoured”.

If there is no such exception, it will print the required output.
 */
import java.util.*;

public class W10_A2 {

    public static void main(String[] args) {
        try {
            // Byte array initialization with characters -->> NPTEL-JAVAJULY-NOCCS
            byte barr[] = {'N', 'P', 'T', 'E', 'L', '-', 'J', 'A', 'V', 'A', 'J', 'U',
                'L', '-', 'N', 'O', 'C', 'C', 'S', '\n'};

            // Scanner object to take input from the user
            Scanner inr = new Scanner(System.in);

            // Asking user for an index number to access in the byte array
            System.out.print("Enter Number: ");
            int n = inr.nextInt();  // Read an integer input from the user

            // Create a string of length 1 from the byte array starting at index n
            String s2 = new String(barr, n, 1);

            // Print the character at index n in the byte array
            System.out.println(barr[n]);

            // Print the string created from the character at index n
            System.out.print(s2);

        } catch (Exception e) {
            // If an exception occurs (e.g., invalid array index), print an error message
            System.out.print("Error: Exception occoured");
        }
    }
}
