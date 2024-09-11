/* 
1 - Problem Statement:      

Define a class Point with members

§ private double x;

§ private double y;

and methods:

§ public Point(double x, double y){}  // Constructor to create a new point?

§ public double slope(Point p2){} // Function to return the slope of the line formed from current Point and another Point
(Assume that input will always be chosen so that slope will never be ifinite)*/

import java.util.Scanner;

class Point {

    private double x;
    private double y;

    // Cretae a constructor Inside the Point Class  
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // Cretae a constructor Inside the Point Class 

    public double slope(Point p2) {
        double slope;
        slope = (p2.y - y) / (p2.x - x);
        return slope;
    }
}
// Main class
public class W04_A03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter X-axis value1: ");
        double x1 = sc.nextDouble();
        System.out.printf("Enter Y-axis value1: ");
        double y1 = sc.nextDouble();
        System.out.printf("Enter X-axis value2: ");
        double x2 = sc.nextDouble();
        System.out.printf("Enter Y-axis value2: ");
        double y2 = sc.nextDouble();
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        System.out.print("Slope is : " + p1.slope(p2));
    }
}
