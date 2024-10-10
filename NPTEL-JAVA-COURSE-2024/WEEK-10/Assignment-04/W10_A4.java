/* A string "s1" is already initialized. You have to read the index "n".
Complete the code segment to catch the exception in the following, if any.
On the occurrence of such an exception, your program should print “exception occur”.
If there is no such exception, your program should replace the char ‘a’ at the index value "n" of the "s1",
then it will print the modified string.
 */
import java.util.*;

public class W10_A4 {

    public static void main(String[] args) {
        try {
            // Initialize the string "NPTELJAVA"
            String s1 = "NPTELJAVA";

            // Prompt the user to enter an index number
            System.out.print("Enter an index number to modify the string: ");
            Scanner inr = new Scanner(System.in);
            int n = inr.nextInt();  // Read the index input from the user

            // Character 'a' to replace the character at the given index
            char c = 'a';

            // Convert the string to a byte array
            byte[] barr = s1.getBytes();

            // Convert character 'a' to its byte equivalent
            byte b1 = (byte) c;

            // Replace the byte at index n with byte 'a'
            barr[n] = b1;

            // Convert the modified byte array back to a string and print it
            System.out.print("Modified string: " + new String(barr));
        } catch (Exception e) {
            // Print an error message if any exception occurs (like invalid index)
            System.out.print("Exception occurred: Invalid input or index out of bounds.");
        }
    }
}
