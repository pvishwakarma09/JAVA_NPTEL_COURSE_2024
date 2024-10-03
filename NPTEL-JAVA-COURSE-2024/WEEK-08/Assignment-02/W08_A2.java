/* Output -->> Default method implementation of First interface.
               Default method implementation of Second 
 */

interface First {

    // default method 
    default void show() {
        System.out.println("Default method implementation of First interface.");
    }
}

interface Second {

    // Default method 
    default void show() {
        System.out.print("Default method implementation of Second interface.");
    }
}

// Implementation class code 
class W08_A2 implements First, Second {
    // Overriding default show method 

    public void show() {
// Call show() of First interface.
        First.super.show();
        // Call show() of Second interface.
        Second.super.show();
    }

    public static void main(String args[]) {
        W08_A2 q = new W08_A2();
        q.show();
    }
}
