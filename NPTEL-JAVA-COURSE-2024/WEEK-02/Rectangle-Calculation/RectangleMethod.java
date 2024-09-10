/* Create a class Rectangle with attributes length and width.

Provide two constructors: one with no parameters (default to 1) and

another with parameters to initialize the attributes.

Use the this keyword to avoid name space collision.

Create a getArea() function that returns the area of the rectangle.

**********************************************************
Guideline to Solve:

§ Define the Rectangle class with attributes and constructors.

§ Define a default Rectangle constructor that inializes length and width to 1.

§ Use the this keyword in the parameterized constructor.

§ Define a getArea() funtion that returns the area of there rectangle

Follow the naming convetion used in the Fixed code.*/

import java.util.Scanner;

class Rectangle {

    private double length;
    private double width;

    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }
}

class RectangleMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        // Create Rectangle objects
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(length, width);

        // Print rectangle dimensions
        System.out.print("Default Rectangle: L, W, A : ");
        System.out.println(rect1.getLength() + ", " + rect1.getWidth() + ", " + rect1.getArea());
        System.out.print("Parameterised Rectangle: L, W, A : ");
        System.out.print(rect2.getLength() + ", " + rect2.getWidth() + ", " + rect2.getArea());

        scanner.close();
    }
}
