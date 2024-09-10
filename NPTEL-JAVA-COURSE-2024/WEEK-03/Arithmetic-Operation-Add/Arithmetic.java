// There are two class cls1 and cls2 which is subclass of cls1.  cls1 having a method "add" which add two numbers. Create two method inside cls2 which will take 2 parameters as input i.e. a and b and print the sum , multiplication and sum of their squares i.e (a^2) + (b2).

import java.util.Scanner;

class cls1 {

    void add(int p, int q) {
        System.out.println(p + q);
    }
}

class cls2 extends cls1 {

    void mul(int p, int q) {
        System.out.println(p * q);
    }

    void task(int p, int q) {
        System.out.print((p * p) + (q * q));
    }
}

public class Arithmetic {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        cls2 obj = new cls2();
        System.out.printf("Enter first Number: ");
        int a = sc.nextInt();
        System.out.printf("Enter Second Number: ");
        int b = sc.nextInt();
        // String tilde = sc.next();
        System.out.printf("Sum of Two Numbers: ");
        obj.add(a, b);
        System.out.printf("mul of Two Numbers: ");
        obj.mul(a, b);
        System.out.printf("task of Two Numbers: ");
        obj.task(a, b);

    }
}
