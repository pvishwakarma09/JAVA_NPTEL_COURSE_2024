


// Code to create two threads for printing even and odd numbers.
// The PrintNumbers class implements Runnable to print numbers in a specified range, with the run method executing the task concurrently.

// import pakage from util class
import java.util.Scanner;
// The PrintNumbers class implements Runnable to define a task for concurrent execution by a thread.
class PrintNumbers implements Runnable {

    private int start; // Private variable to store the starting number for the range
    private int end;  // Private variable to store the ending number for the range

    // Constructor to initialize the start and end values for the number range
    public PrintNumbers(int start, int end) {
        this.start = start; // Assign the starting number to the instance variable
        this.end = end;   // Assign the ending number to the instance variable
    }

    // The run method contains the code to be executed by the thread.
    @Override
    public void run() {
        // Loop through the range and print numbers.
        for (int i = start; i <= end; i += 2) {
            // Print the current thread name and the number.
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

class W07_A5 {

    // Code to create two threads, one printing even numbers and the other printing odd numbers
    // Main method to create and start threads for printing even and odd numbers.
    public static void main(String[] args) {
        // Scanner to take user input.
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the starting and ending values for even numbers
        System.out.print("Enter the starting value for even numbers: ");
        int evenStart = scanner.nextInt();
        System.out.print("Enter the ending value for even numbers: ");
        int evenEnd = scanner.nextInt();

        // Prompt user for the starting and ending values for odd numbers.
        System.out.print("Enter the starting value for odd numbers: ");
        int oddStart = scanner.nextInt();
        System.out.print("Enter the ending value for odd numbers: ");
        int oddEnd = scanner.nextInt();
        // Create threads for printing even and odd numbers.
        Thread evenThread = new Thread(new PrintNumbers(evenStart, evenEnd), "EvenThread");
        Thread oddThread = new Thread(new PrintNumbers(oddStart, oddEnd), "OddThread");

        // Start the even numbers thread.
        evenThread.start();
        try {
            // Wait for 1 second before starting the odd numbers thread.
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Start the odd numbers thread.
        oddThread.start();
        scanner.close();
    }
}