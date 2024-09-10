// Simple java Program using class Conceptsjava
// To create a Student class 
public class Student{
    String name;  // declaire a variable "name" hold the string.
    int age; // declaire a variable "age " hold the intiger value .
    // Create a constructor in this class I know class name and constructor name should be same.
    public Student(String name , int age ){
        // Constructor ko value assign kartey hai dot(.this) keyword
        this.name=name;
        this.age=age;
    }
    // display the output define a built in method 
    public void printDetails(){
        System.out.println("Name:"+name); // Print statements
        System.out.println("Age"+age);   // Print statements
    }
    // To call the main method define its
    public static void main(String[] args){
        // create an onject of Student class
        Student s1=new Student("Prem", 20); // in this formate second--> Student is constructor of the "Student class" also declair the constructor in Student class
        s1.printDetails(); // In this line object s1 call the print detail method in student class
    }

}