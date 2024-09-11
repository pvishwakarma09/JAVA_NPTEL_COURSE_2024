//  Write a  program to create a method that takes a string as input and throws an exception if the string does not contain vowels.
// (Note: Check both upper and lower case vowels)

import java.util.Scanner;

class NoVowelsException extends Exception {
  public NoVowelsException(String message) {
    super(message);
  }
}

public class W05_P3 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      try {
        System.out.println("Enter any String: ");
        String text = input.nextLine();

        System.out.println("Original string: " + text);
        checkVowels(text);
        System.out.print("String contains vowels.");
      } catch (NoVowelsException e) {
        System.out.print("Error: " + e.getMessage());
      }
    }
public static void checkVowels(String text) throws NoVowelsException {
    if (!text.toLowerCase().matches(".*[aeiou].*")) {
        throw new NoVowelsException("String does not contain any vowels.");  
    }
}
}