// Consider First n even numbers starting from zero(0).Complete the code segment to calculate sum of  all the numbers divisible by 3 from 0 to n. Print the sum.

// Prefixed Fixed Code:
import java.util.Scanner;

public class W04_A5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int sum = 0;
int result = 1;
        int i = 0;
        while (result <= n) {
            if (i % 2 == 0) {
                if (i % 3 == 0) {
                    sum = sum + i;

                }
                result = result + 1;
            }
            i = i + 1;
        }
System.out.print("Sum is : "+sum);// Suffixed Fixed Code:
        sc.close();
    }
}