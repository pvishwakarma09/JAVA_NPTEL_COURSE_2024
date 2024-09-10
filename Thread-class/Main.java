// declare Thread class  and MyThread subclass
class MyThread extends Thread {

    private int threadId;
    private String name;
    private int divisor;

    // make a constructor
    public MyThread(int threadId, String name, int divisor) {
        this.threadId = threadId;
        this.name = name;
        this.divisor = divisor;
    }

    // exception handle
    public void run() {
        System.out.println("Starting " + name);
        try {
            int result = 100 / divisor;
            System.out.println(name + " Result=" + result);
        } catch (ArithmeticException e) {
            System.out.println(name + ": Error - " + e.getMessage());
        }
        System.out.println("Exiting " + name);
    }
}
// Make a main class
public class Main {

    public static void main(String[] args) {
        MyThread thread1 = new MyThread(1, "Thread-1", 5);
        MyThread thread2 = new MyThread(2, "Thread-2", 0);

        // start new Thread
        thread1.start();
        thread2.start();
    }
}
