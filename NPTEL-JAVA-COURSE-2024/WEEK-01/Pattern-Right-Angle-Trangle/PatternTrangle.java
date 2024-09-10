// Write a Java program to make such a pattern like a right angle triangle with the number increased by 1.

import java.util.Scanner;

public class PatternTrangle {

    public static void main(String[] args) {
        int i, j, n, k = 1;

        System.out.print("Input number of rows : ");

        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print((k++) + " ");
            }
            System.out.println();
        }
    }
}
