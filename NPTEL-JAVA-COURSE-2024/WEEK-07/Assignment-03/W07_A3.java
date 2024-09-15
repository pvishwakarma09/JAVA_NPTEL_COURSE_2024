// Write a program to remove all occurrences of an element from array in Java.
// Import pakage

import java.util.*;

public class W07_A3 {

    public static void main(String[] args) {
        // To create an object of the Scanner class
        Scanner scanner = new Scanner(System.in);
        // Input array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        // User Input
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        // for-loop
        for (int i = 0; i < n; i++) {
            System.out.print("element: ");
            array[i] = scanner.nextInt();
        }

        // Element to remove
        System.out.print("Enter the element to remove: ");
        int elementToRemove = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Removing element and printing result
        System.out.println("Original Array: " + Arrays.toString(array)); // Print the original array
        array = removeAll(array, elementToRemove); // Remove the specified element from the array
        System.out.print("Array after removing " + elementToRemove + ": " + Arrays.toString(array)); // Print the modified array
    }
    // function Name -->> removeAll ()
    public static int[] removeAll(int[] array, int elementToRemove) {
        int[] result = new int[array.length]; // Create a new array to hold the result
        int index = 0; // Initialize index for the result array

        // Iterate through the original array
        for (int value : array) {
            // Copy only if the current element is not equal to the element to be removed
            if (value != elementToRemove) {
                result[index++] = value; // Add the element to the result array
            }
        }

        // If the resulting array is smaller than the original, resize it
        return Arrays.copyOf(result, index);
    }
}
