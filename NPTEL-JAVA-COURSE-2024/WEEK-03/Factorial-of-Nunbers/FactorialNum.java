/* Write a program to print the factorial of a number by defining a recursive method named 'Factorial'.

Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-

4! = 1*2*3*4 = 24

3! = 3*2*1 = 6

2! = 2*1 = 2

Also,

1! = 1

0! = 1 */

import java.util.Scanner;
class FactorialNum{
public static int factorial(int x){
      if(x == 0 || x == 1){
        return 1;
      }
      else{
        return factorial(x-1)*x;
      }
    }
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        System.out.printf("Enter number: ");
        x = in.nextInt();
        System.out.printf("Factorial of a number is: ");
        System.out.print(factorial(x));   
  }
}