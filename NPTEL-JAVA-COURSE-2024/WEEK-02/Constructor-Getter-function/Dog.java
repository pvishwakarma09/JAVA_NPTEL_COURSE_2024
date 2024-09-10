/* 
Complete the code by creating the constructor and the getter functions for a class Dog as defined below.*/

import java.util.Scanner;

// Class Declaration
public class Dog {

    // Instance Variables
    private String name;
    private String breed;
    private int age;
    private String color;

    public Dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    // method 1
    public String getName() {
        return name;
    }

    // method 2
    public String getBreed() {
        return breed;
    }

    // method 3
    public int getAge() {
        return age;
    }

    // method 4
    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Breed:");
        String breed = scanner.nextLine();
        System.out.println("Enter Age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after age
        System.out.println("Enter Color:");
        String color = scanner.nextLine();

        Dog tommy = new Dog(name, breed, age, color);

        System.out.println("Hi my name is: " + tommy.getName());
        System.out.println("My breed is: " + tommy.getBreed());
        System.out.println("My age is: " + tommy.getAge());
        System.out.print("My color is: " + tommy.getColor());

        scanner.close();
    }
}
