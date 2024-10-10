// Complete the code fragment to read three integer inputs from keyboard and find the sum and store the result in the variable "sum".
// First approach with user input and use for-loop

// import java.util.*;
// public class W10_A1 {
//     public static void main(String[] args) {
//         int i, n = 0, sum = 0;
//         Scanner inr = new Scanner(System.in);
//         System.out.println("Enter first, second, Third number: ");
// //To read 3 integer inputs from keyboard and find their sum.
//         for (i = 0; i < 3; i++) {
//             n = inr.nextInt();
//             sum = sum + n;
//         }
//         System.out.print("sum of three number is: " + sum);
//     }
// }

// Second approach with proper user input 
//Write the appropriate code to read 3 integer inputs from keyboard and find their sum.
import java.util.Scanner;

public class W10_A1 {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner sc = new Scanner(System.in);

        // Read three integer inputs from the user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter Third number: ");
        int num3 = sc.nextInt();

        // Calculate the sum of the three integers
        int sum = num1 + num2 + num3;

        // Print the result
        System.out.print("sum of three number is: " + sum);
    }
}
