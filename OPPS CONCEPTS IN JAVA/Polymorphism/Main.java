// make a super or parent class 
class Animal{
    // create a function that name is sound 
    void sound(){
        System.out.println("The animal makes a sound");
    }
}
// Dog class ( child class ) sub Class

class Dog extends Animal{
    // method overriding 
    @Override
     void sound(){
        System.out.println("The Dogs barks");
     }
}

// Create a Cat class( Child class ) SubClass of Animal class
class Cat extends Animal{
    // Method override karne, se method ka print statement change kar dete hai .
    @Override
    void sound(){
        System.out.println("The Cat Meows");
    }
}

// Create a Main class ---- Object create with array uses

// public class Main{
//     public static void main(String[] args) {
//         // create an array of Animal objects
//         Animal[] animals=new Animal[3];
//         // intilize the array with different animal object .. 
//         // To handle diffrent-different object in one method .
//         animals[0]=new Dog();
//         animals[1]=new Cat();
//         animals[2]=new Animal();

//         // call the sound method on each animal 
//         /*syntax for loop ::
//         for (  type variable : array ) {
//         //code 
//         }
//         */
//         for (Animal animal:animals ){
//             animal.sound();
//         }
        
//     }
// }

// Create a Main class ---- Object create with normal method

public class Main{
    public static void main(String[] args){
        // creating object and handle object
        Animal myAnimal=new Animal(); // myAnimal name  ka object hai
        Animal myDog =new Dog(); // myDog name ka object hai
        Animal myCat=new Cat(); // myCat name ka object hai

        // print sound or call sound method 
        myAnimal.sound();
        myDog.sound();
        myCat.sound();

    }
}