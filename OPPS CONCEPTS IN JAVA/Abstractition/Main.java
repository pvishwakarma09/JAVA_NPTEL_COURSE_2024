// Abstract class, Car ek class hai
abstract class Car {
    public abstract void startEngine();
    public abstract void accelerate();
    public abstract void brake();
}
// concrete class
// use both concepts of Inheritance (extends keyword) and Polymorphism( Car myCar=new Tata())
class Tata extends Car{
    // To override the StratEngine abstarct class
    @Override
    public void startEngine(){
        System.out.println("Tata Engine Started");
    }
    // To override the accelerate abstarct class
    @Override
    public void accelerate(){
        System.out.println("Tata Accelarating");
    }
    // To override the brake abstarct class
     @Override
    public void brake(){
        System.out.println("Tata Breaking");
    }
}

// Main class 
public class Main {
    public static void main(String[] args) {
    Car myCar=new Tata();  
    // Tata myCar=new Tata(); -----  This line generate the error because Main method is outside the car method. inheritance and polymorphism concepts is also used.
    myCar.startEngine();
    myCar.accelerate();
    myCar.brake();
    }
}
