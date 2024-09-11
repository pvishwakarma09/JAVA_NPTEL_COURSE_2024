//  Write a program to create an interface Playable with a method play() that takes no arguments and returns void.
// Create three classes Football, Volleyball, and Basketball that implement the Playable interface and override the play() method to play the respective sports.

interface Playable {

    // Declare the abstract method "play" that classes implementing this interface must provide
    void play();
}

class Football implements Playable {

    public void play() {
        System.out.println("Playing football");
        // Add code to play football
    }
}
// Declare the Volleyball class, which implements the Playable interface

class Volleyball implements Playable {

    // Implement the "play" method required by the Playable interface
    public void play() {
        // Print a message indicating that volleyball is being played
        System.out.println("Playing volleyball");
        // Additional code to play volleyball can be added here
    }
}
// Declare the Basketball class, which implements the Playable interface

class Basketball implements Playable {

    // Implement the "play" method required by the Playable interface
    public void play() {
        // Print a message indicating that basketball is being played
        System.out.print("Playing basketball");
        // Additional code to play basketball can be added here
    }
}

public class W05_P5 {

    public static void main(String[] args) {
        // Create instances of Playable objects for football, volleyball, and basketball
        Playable football = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();

        // Call the "play" method on each Playable object to play different sports
        football.play();
        volleyball.play();
        basketball.play();
    }
}
