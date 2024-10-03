
import java.util.Scanner;

class W07_A2 {

    // main() method start
    public static void main(String[] args) {
        int rows, cols;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter odd numbers for rows and colums to get perfect Swastika.");
        // Prompt user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        rows = sc.nextInt();

        // Prompt user to enter the number of columns
        System.out.print("Enter the number of columns: ");
        cols = sc.nextInt();

        // Close Scanner class
        sc.close();

        // Call swastika() method to design Swastika for the specified rows and columns
        printswastika(rows, cols);
    }

    static void printswastika(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Check whether i is less than half of rows
                if (i < rows / 2) {
                    // Check whether j is less than half of columns
                    if (j < cols / 2) {
                        // Print '*' if j == 0
                        if (j == 0) {
                            System.out.print("*");
                        } else {
                            // Print space otherwise
                            System.out.print(" ");
                        }
                    } else if (j == cols / 2) {
                        System.out.print("*");
                    } else {
                        // i = 0 denotes first row that will have '*'
                        if (i == 0) {
                            System.out.print("*");
                        }
                    }
                } else if (i == rows / 2) {
                    System.out.print("*");
                } else {
                    // When i > rows/2, the middle and last column will have '*'
                    if (j == cols / 2 || j == cols - 1) {
                        System.out.print("*");
                    } else if (i == rows - 1) {
                        // If j <= cols/2 OR if it is last column, the last row will have '*'
                        if (j <= cols / 2 || j == cols - 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
