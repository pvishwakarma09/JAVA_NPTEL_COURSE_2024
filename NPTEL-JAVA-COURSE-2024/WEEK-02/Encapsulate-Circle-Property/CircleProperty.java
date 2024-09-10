/*
Create a class Circle that encapsulates the properties of a circle.

The class should have a private field for the radius, a constructor to initialize the radius, and methods to calculate the area and circumference of the circle.

NOTE: use Math.PI for PI calculations (DO NOT USE 22/7)

*********************************************************
Guideline to Solve:

§ Define the Circle class with attributes and constructors.

§ Use the this keyword in the parameterized constructor.

§ Define a getArea() funtion that returns the area of there Circle (use Math.PI)

§ Define a getCircumference() funtion that returns the circumference of there Circle (use Math.PI)
 */

import java.util.Scanner;
class Circle {
    // Private field
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
public class CircleProperty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of Circle: ");
        double radius = scanner.nextDouble();

        // Create circle object
        Circle circle = new Circle(radius);

        // Calculate and print area
        double area = circle.calculateArea();
        // Print area to 2 decimal places
        System.out.printf("Area of Circle: %.2f\n", area);

        // Calculate and print circumference
        double circumference = circle.calculateCircumference();
        // Print circumference to 2 decimal places
        System.out.printf("Circumference of Circle: %.2f", circumference);
        scanner.close();
    }
}