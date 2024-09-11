// Write a program to take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ). Print average and product of all numbers.

import java.util.*;

public class W03_P4 {
public static void main(String[] args) {

String choice = "";
Scanner input = new Scanner(System.in);
int sum = 0;
int product = 1;
int count = 0;
while(!choice.equals("q")){
    System.out.println("Enter a number or q to quit: ");
    choice = input.next();

    if(!choice.equals("q")){
        int number = Integer.parseInt(choice);
        sum = sum+number;
        product = product*number;
        count++;
    }
} 

System.out.print("Product is: "+product+"\nAverage is: "+((float)sum/count));
}
}