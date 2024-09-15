/* 
Write a Java program to find longest word in given input.
Private Test cases used for evaluation	Input	Expected Output	Actual Output	Status
Test Case 1	
This is an NPTEL course
 The longest word in the text is: course
The longest word in the text is: course
Passed

 */
// Import pakage 
import java.util.Scanner;

public class W07_A1 {
// Method to find the longest word in a given text

    public static String findLongestWord(String text) {
        String longestWord = "";

        // Split the text into words based on whitespace
        String[] words = text.split("\\s+");

        // Iterate through each word to find the longest one
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter text
        System.out.println("Enter some text:");
        // Declaire a variable for user input
        String text = scanner.nextLine();

        // Call the method to find the longest word
        String longestWord = findLongestWord(text);

        // Print the longest word found
        System.out.print("The longest word in the text is: " + longestWord);
    }
}
