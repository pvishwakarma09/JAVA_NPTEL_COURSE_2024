/*Write a Java program to display the number rhombus structure.
Input: n=2
Output:
   1
 2 1 2
   1
   */
import java.util.Scanner;

class W09_A1 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in); // in --- is a object of scanner  class
        System.out.print("Input the number:  ");
        int n = in.nextInt();
        int count = 1;
        int no_of_spaces = 1;
        int start = 0;

        for (int i = 1; i < (n * 2); i++) {

            for (int spc = n - no_of_spaces; spc > 0; spc--) {
                System.out.print(" ");
            }
            if (i < n) {
                start = i;          //for number
                no_of_spaces++;    //for spaces
            } else {
                start = n * 2 - i;   //for number
                no_of_spaces--;      //for space
            }
            for (int j = 0; j < count; j++) {
                System.out.print(start);
                if (j < count / 2) {
                    start--;
                } else {
                    start++;
                }
            }
            if (i < n) {
                count = count + 2;
            } else {
                count = count - 2;
            }

            System.out.println();
        }
    }
 }
