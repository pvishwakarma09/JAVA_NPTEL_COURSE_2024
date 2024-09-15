/* 
Write a program to print Swastika Pattern in Java. 
Input is 2 numbers. 
(Rows=R and Columns=C)

For Example: Input:R=5 , C=5
Output: 

* ***
* *
*****
  * *
*** *

 */

// import scanner from util pakage
import java.util.Scanner;

class SwastikaPattern {
    // main() method start 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Prompt user to enter the number of rows
        // System.out.println("Please enter odd numbers for rows and colums to get perfect Swastika."); 
        System.out.print("Enter total rows 'n': ");
        int rows = sc.nextInt(); // rows = 5 
        // Prompt user to enter the number of columns
        System.out.print("Enter total columns 'm': ");
        int cols = sc.nextInt(); // cols = 5
        // Call method to print the Swastika pattern
        printSwastika(rows, cols);
    }
    // We created a function named printSwastika

    static void printSwastika(int rows, int cols) {
        // Iterate over each row --> outer for-loop
        for (int i = 1; i <= rows; i++) {
            // Iterate over each column --> Inner for-loop
            for (int j = 1; j <= cols; j++) {
                // Top half and middle row
                if (i < rows / 2) {
                    // First half of the columns and top row
                    if (j < cols / 2 || i == 0 || j == cols / 2) {
                        System.out.print("*"); // Print '*'
                    } else {
                        System.out.print(" " + ""); // Print space
                    }
                    // Middle row
                } else if (i == rows / 2) {
                    System.out.print("*"); // Print '*' in the middle row
                    // Bottom half
                } else {
                    // Vertical line in the middle and last column, and last row
                    if (j == cols / 2 || i == rows - 1 || j == cols - 1) {
                        System.out.print("*"); // Print '*'
                    } else {
                        System.out.print(" " + ""); // Print space
                    }
                }
            }
            // Move to the next line after finishing a row --inne loop end
            System.out.println(" ");
        } // Outer loop end
    }
}
