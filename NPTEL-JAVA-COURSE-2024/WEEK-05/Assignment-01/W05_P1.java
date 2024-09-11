//  Write a program to create a method that takes an integer as a parameter and throws an exception if the number is odd.

import java.util.*;

class IllegalArgumentException extends Exception {
  public IllegalArgumentException(String message) {
    super(message);
  }
}

public class W05_P1 {
    public static void main(String[] args) {
     // int n = 18;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a Number: ");
      int n=input.nextInt();
      trynumber(n);
    }
public static void trynumber(int n) {
      try {
        checkEvenNumber(n);
        System.out.print(n + " is even.");
      } catch (IllegalArgumentException e) {
        System.out.print("Error: " + e.getMessage());
      }
    }
  
    public static void checkEvenNumber(int number) throws IllegalArgumentException {
      if (number % 2 != 0) {
        throw new IllegalArgumentException(number + " is odd.");
      }
    }
}