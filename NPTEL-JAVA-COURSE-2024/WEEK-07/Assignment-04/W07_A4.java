// Write a program to compute the sum of all prime numbers in a given range.
// The range value will be positive.
// Follow the naming convention as given in the main method of the suffix code.

import java.util.Scanner;

public class W07_A4 {

    // function Name--> checkPrime
    static boolean checkPrime(int numberToCheck) {
        if (numberToCheck == 1) {
            return false;
        }
        for (int i = 2; i * i <= numberToCheck; i++) {
            if (numberToCheck % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to iterate the loop from l to r
    // If prime number detects, sum the value
    // Second Function Name --> primeSum
    static int primeSum(int l, int r) {
        int sum = 0;
        for (int i = r; i >= l; i--) {

            // Check for prime
            boolean isPrime = checkPrime(i);
            if (isPrime) {

                // Sum the prime number
                sum = sum + i;
            }
        }
        return sum;
    }
    // Main Method or Fuction

    public static void main(String[] args) {
        // We create an object of the Scanner class.
        Scanner sc = new Scanner(System.in);
        // To take input from the user.
        System.out.print("Enter first Number 'x': ");
        int x = sc.nextInt();
        System.out.print("Enter Second Number 'y': ");
        int y = sc.nextInt();
        // Output using a print statement.
        System.out.print("The primeSum is : " + primeSum(x, y));
    }
}
