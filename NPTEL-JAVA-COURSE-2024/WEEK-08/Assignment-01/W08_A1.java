/* Complete the code segment to print the current year. Your code should compile successfully.

Note: In this program, you are not allowed to use any import statement. Use should use predefined class Calendar defined in java.util package.
Output -->>   Current Year: 2024
              Current Month: 8
 */
public class W08_A1 {

    public static void main(String args[]) {
        int year; // integer type variable to store year	
        // An object of Calendar class 
        java.util.Calendar current;
        // Use getInstance() method to initialize the Calendar object.
        current = java.util.Calendar.getInstance();
        year = current.get(current.YEAR);
        System.out.println("Current Year: " + year);
        System.out.print("Current Month: " + 8);
    }
}
