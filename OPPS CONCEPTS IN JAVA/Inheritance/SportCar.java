// we discuss the inheritance property in java
// create a super or parent class

class Car {
    int speed; // ek intiger variable/fields declair kiya " speed " .
    // create a constructor of car class .. pass speed as argument or parameter
    public Car(int speed){
        this.speed=speed;
    }
    // Define a method incrementSpeed and declair a variable increment for intiger value. dont need return 
    public void incrementSpeed(int increment){
        speed+=increment; // speed = speed + increment .. we increment the spped 
    }
     // Define a method decrementSpeed and declair a variable decrement for intiger value
    public void decrementSpeed(int decrement){
        speed-=decrement; // speed = speed + decrement .. we decrement the spped 
    }
    // create a method to print speed
    public void printSpeed(){
        System.out.println("Speed is:"+speed);
    }

}
// create a sub-class or a child class:SportCar ..all property acces in child calss using inheritance or extend keyword
class SportCar extends Car{
    // create Constructor That calls the Superclass constructor
    public SportCar(int speed){
        super(speed);
    }
    // declair a main method  in child class 
    public static void main(String[] args){
        // create a sports car object, and assign value in constructor 
        SportCar mySportCar=new SportCar(100);

        // print initial spped
        System.out.println("Print Intial Speed");
        mySportCar.printSpeed();

        // Increment speed
        mySportCar.incrementSpeed(20);
        System.out.println("Print Speed after incriment: 100+20");
        mySportCar.printSpeed();

        // decrement speed
        mySportCar.decrementSpeed(30);
        System.out.println("Print Speed after decriment: 120-30");
        mySportCar.printSpeed();
    }
}
// iskon run karne ke liye humko main class ko compile karna padega lekin yaha par main class car nahi hai inheritance ke concepts se ab hamari main class SportsCar ho gayi hai.
