import java.util.Scanner; // Import the Scanner class for user input

public class Main {

    public static void main(String[] args) {
        
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the principal amount (initial investment)
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Ask the user for the annual interest rate 
        System.out.print("Enter the interest rate (e.g., 5 for 5%): ");
        double rate = scanner.nextDouble() / 100;

        // Ask the user for the number of times the interest is compounded per year
        System.out.print("Enter the number of times compounded per year: ");
        int timesCompounded = scanner.nextInt();
        
        // Ask the user for the number of years the money is invested
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        // Calculate the total amount using the compound interest formula
        double amount = principal * Math.pow(1 + rate/timesCompounded, timesCompounded*years);

        // Print the final amount with the formatted output
        System.out.printf("The amount after %d years is: $%f", years, amount);

        // Close the scanner to free system resources
        scanner.close();
    }
    
}