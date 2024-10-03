// Write a Java program to find the length of the longest sequence of zeros in binary representation of an integer.

import java.util.Scanner;

public class W09_A5 {

    static int maxZeros(int N) {
        // variable to store the length of
        // longest consecutive 0's
        int maxm = -1;

        // to temporary store the consecutive 0's
        int cnt = 0;

        while (N != 0) {
            if ((N & 1) == 0) {
                cnt++;
                N >>= 1;
                maxm = Math.max(maxm, cnt);
            } else {

                maxm = Math.max(maxm, cnt);
                cnt = 0;
                N >>= 1;
            }
        }
        return maxm;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.print(maxZeros(n));

    }

}
