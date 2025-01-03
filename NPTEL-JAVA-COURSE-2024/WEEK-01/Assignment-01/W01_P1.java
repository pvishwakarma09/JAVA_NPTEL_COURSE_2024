// Write a Java program to print the area and perimeter of a rectangle.

import java.util.Scanner;
public class W01_P1 { 
   public static void main(String[] strings) {
       double width ;
       double height;

       Scanner in = new Scanner(System.in);
       System.out.print("Enter width: ");
       width = in.nextDouble();
       System.out.print("Enter height: ");
       height = in.nextDouble();
// Calculate the perimeter of the rectangle
    double perimeter = 2 * (height + width);

    // Calculate the area of the rectangle
    double area = width * height;
// Print the calculated perimeter using placeholders for values
       System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f\n", height, width, perimeter);

// Print the calculated area using placeholders for values
       System.out.printf("Area is %.1f * %.1f = %.2f", width, height, area);    
   }
}