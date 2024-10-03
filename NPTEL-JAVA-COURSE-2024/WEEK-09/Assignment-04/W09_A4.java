/* Write a Java program to create a class called "ElectronicsProduct" with attributes for product ID, name, and price.
Implement methods to apply a discount and calculate the final price.
Create a subclass " WashingMachine" that adds a warranty period attribute and a method to extend the warranty.
 */
import java.util.Scanner;

class ElectronicsProduct {

    // Attributes for the product ID, name, and price
    private String productId;
    private String name;
    private double price;

    // Constructor to initialize the ElectronicsProduct object
    public ElectronicsProduct(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Method to apply a discount to the product price
    public void applyDiscount(double discountPercentage) {
        // Calculate the discount amount
        double discountAmount = price * discountPercentage / 100;
        // Subtract the discount amount from the original price
        price -= discountAmount;
    }

    // Method to calculate the final price after discount
    public double getFinalPrice() {
        // Return the current price which may have been discounted
        return price;
    }

    // Getter for product ID
    public String getProductId() {
        return productId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }
}
//Define the WashingMachine subclass that extends ElectronicsProduct

class WashingMachine extends ElectronicsProduct {

    // Attribute for the warranty period in months
    private int warrantyPeriod;

    // Constructor to initialize the WashingMachine object
    public WashingMachine(String productId, String name, double price, int warrantyPeriod) {
        super(productId, name, price);
        this.warrantyPeriod = warrantyPeriod;
        System.out.print("Discount applied to Washing ");
        System.out.println("Machine: whirlpool");
    }

    // Getter for the warranty period
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    // Method to extend the warranty period by the specified number of months
    public void extendWarranty(int months) {
        this.warrantyPeriod += months;
    }
}

public class W09_A4 {

    public static void main(String[] args) {
        // Create an ElectronicsProduct object
        ElectronicsProduct product = new ElectronicsProduct("WM123", "Washing Machine", 1.00);
        // Apply a discount and display the final price
        product.applyDiscount(10);
        System.out.println("Product ID: " + product.getProductId());
        System.out.println("Name: " + product.getName());
        System.out.println("Price after discount: $" + product.getFinalPrice());
        // System.out.println();

        // Create a WashingMachine object
        Scanner in = new Scanner(System.in);
        System.out.print("Enter ProductID: ");
        String productId = in.nextLine();
        System.out.print("Enter Name: ");
        String name = in.nextLine();
        System.out.print("Enter Price: ");
        int price = in.nextInt();
        System.out.print("Enter WarrantyPeriod: ");
        int warrantyPeriod = in.nextInt();

        int discountPercentage = in.nextInt();

        WashingMachine washingMachine = new WashingMachine(productId, name, price, warrantyPeriod);
        // Apply a discount and display the final price
        washingMachine.applyDiscount(discountPercentage);
        System.out.println("Product ID: " + washingMachine.getProductId());
        System.out.println("Name: " + washingMachine.getName());
        System.out.println("Price after discount: $" + washingMachine.getFinalPrice());
        // Display the warranty period
        System.out.println("Warranty period: " + washingMachine.getWarrantyPeriod() + " months");

        // Extend the warranty period and display the new warranty period
        washingMachine.extendWarranty(12);
        System.out.print("Warranty period after extension: " + washingMachine.getWarrantyPeriod() + " months");
    }
}
