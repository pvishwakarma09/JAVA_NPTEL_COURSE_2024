// Example of 1D Array

class TestArray {

    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40}; // Initilization of an array
        //Traversing array
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        //Average Calculations
        float sum = 0, avg;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        // calculating average of given numbers
        avg = sum / a.length;
        System.out.println("Average is " + avg);
    }
}
