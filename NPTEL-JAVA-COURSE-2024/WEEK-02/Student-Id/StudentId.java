/* Create a class Student with private attributes for name and age.

Use a constructor to initialize these attributes and provide public getter methods to access them.

In the main method, an instance of Student is created and the student's details are printed.

*********************************************************************************
Guideline to Solve:

§ Define the Student class with private attributes.

§ Use a constructor to initialize the attributes.

§ Implement getter methods for the attributes.
Follow the naming convetion used in the Fixed code.
 */

import java.util.Scanner;

class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class StudentId {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        // Create Student object
        Student student = new Student(name, age);

        // Print student details
        System.out.println("Student Name: " + student.getName());
        System.out.print("Student Age: " + student.getAge());

        scanner.close();
    }
}
