import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declare variables
        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        // Ask the user for the item name
        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();
        // Ask the user for the price of the item
        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();
        // Ask the user for the quantity they want to buy
        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        // Calculate total cost
        total = price * quantity;

        // Display the result
        System.out.println("\nYou have bought " + quantity + " " + item + "/s.");
        System.out.println("Your total is " + currency + total);
        
        scanner.close();// Close the scanner to free resources
    }
}