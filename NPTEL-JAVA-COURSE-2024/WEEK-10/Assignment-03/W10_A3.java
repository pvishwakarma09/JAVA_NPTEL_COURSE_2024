/* A string is read from the keyboard and is assigned to variable "s1". Your program should print the "number of vowels in s1”. However, if your input is other than "String" data type it will print "0".
 */

import java.io.*;

public class W10_A3 {

    public static void main(String[] args) {
        int c = 0;  // Variable to count the number of vowels

        try {
            // Prompting the user to enter a string
            System.out.print("Enter a string: ");
            // InputStreamReader reads bytes and decodes them into characters
            InputStreamReader r = new InputStreamReader(System.in);

            // BufferedReader reads text from a character input stream efficiently
            BufferedReader br = new BufferedReader(r);

            // Reading a single line of text input from the user
            String s1 = br.readLine();

            // Looping through each character of the input string
            for (int i = 0; i < s1.length(); i++) {
                char s2 = s1.charAt(i);  // Extract the character at index i

                // Checking if the character is a vowel (both lowercase and uppercase)
                if (s2 == 'e' || s2 == 'E' || s2 == 'a' || s2 == 'A' || s2 == 'i' || s2 == 'I'
                        || s2 == 'o' || s2 == 'O' || s2 == 'u' || s2 == 'U') {
                    c = c + 1;  // Increment the vowel count
                }
            }

            // Print the total number of vowels found in the input string
            System.out.print("Number of vowels: " + c);

        } catch (Exception e) {
            // If any exception occurs (e.g., input error), print 0
            System.out.print(0);
        }
    } // end of main
} // end of class
