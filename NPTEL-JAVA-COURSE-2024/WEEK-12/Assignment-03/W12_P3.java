// Write a program to print Butterfly star pattern.

import java.util.Scanner;

public class W12_P3 {

    public static void main(String[] args) {
        //  int n = 7; // Number of rows (should be odd for symmetry)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
// Upper part of the butterfly
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if (j <= i || j > 2 * n - i) {
                    System.out.print("*"); 
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower part of the butterfly
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= 2 * n; j++) {
                if (j <= i || j > 2 * n - i) {
                    System.out.print("*"); 
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
