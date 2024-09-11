// Complete the code segment to print the following using the concept of extending the Thread class in Java:
// -----------------OUTPUT-------------------
// Thread is Running.
// -----------------------------------------------

class W06_P3 extends Thread {

    public void run() {
        System.out.print("Thread is Running.");
    }

    public static void main(String args[]) {

        // Creating object of thread class
        W06_P3 thread = new W06_P3();

        // Start the thread
        thread.start();
    }
}
