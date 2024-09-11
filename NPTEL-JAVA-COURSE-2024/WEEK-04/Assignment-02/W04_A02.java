// This program to exercise the create static and non-static methods. A partial code is given, you have to define two methods, namely sum( ) and multiply( ). These methods have been called to find the sum and product of two numbers. Complete the code segment as instructed.  

import java.util.Scanner;

class QuestionScope {

    int sum(int a, int b) { // non-static method
        return a + b;
    }

    static int multiply(int a, int b) { // static method
        return a * b;
    }
}

public class W04_A02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter First Number: ");
        int n1 = sc.nextInt();
        System.out.printf("Enter Second Number: ");
        int n2 = sc.nextInt();
        int sum = 0, prod = 0;
        QuestionScope st = new QuestionScope(); // Create an object to call non-
        // static method
        sum = st.sum(n1, n2); // Call the method
        prod = QuestionScope.multiply(n1, n2);  // Create an object to call
        // static method
        System.out.println("Sum is : " + sum);
        System.out.print("Product is : " + prod);
        sc.close();
    }
}
