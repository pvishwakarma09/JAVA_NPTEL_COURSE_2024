// This program is to find the GCD (greatest common divisor) of two integers writing a recursive function findGCD(n1,n2).
// Your function should return -1, if the argument(s) is(are) negative number(s).

import java.util.Scanner;

interface GCD {

    public int findGCD(int n1, int n2);
}

class B implements GCD {

    int n1, n2;

    //Create a method to calculate GCD
    public int findGCD(int n1, int n2) {
        if (n1 == 0 && n2 == 0) {
            return -1;
        } else if (n2 == 0) {
            return n1;
        } else {
            // Recursive call and printing
            System.out.printf("GCD is : %d + %d\n", n2, n1 % n2);  // Printing both n2 and n1 % n2
            return findGCD(n2, n1 % n2);

        }
    }
}

public class W06_P2 {

    public static void main(String[] args) {
        B a = new B();   //Create an object of class B
        // Read two numbers from the keyboard
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int p1 = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int p2 = sc.nextInt();
        System.out.print(a.findGCD(p1, p2));
    }
}
