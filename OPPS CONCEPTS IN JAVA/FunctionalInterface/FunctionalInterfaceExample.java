class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Create an anonymous inner class object implementing Runnable
        new Thread(new Runnable() {
            @Override // This is a function overriding concept
            public void run() {
                System.out.println("Thread using Functional Interface");
            }
        }).start();  // start() method present in Runnable Thread.
    }
}
