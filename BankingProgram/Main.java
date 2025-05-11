import java.util.Scanner; // Import the Scanner class for user input

public class Main {

    // Create a Scanner object for reading user input (global, shared by all methods)
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int choice; // Variable to store the user's menu choice
        double balance = 0; // Variable to store the account balance, initialized to 0
        
        // Main program loop
        do{

            // Print the main menu
            System.out.println("**********************");
            System.out.println("---Banking Program---");
            System.out.println("**********************");

            System.out.println("1 : Show Balance");
            System.out.println("2 : Deposit");
            System.out.println("3 : Withdraw");
            System.out.println("4 : Exit");

            System.out.println("**********************");
            
            // Prompt the user to choose an option
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            // Perform an action based on the user's choice
            switch (choice) {
                
                case 1: // Show current balance
                        showBalance(balance);
                    break;                
                case 2: // Deposit money and add to balance
                        balance += deposit();
                    break;
                case 3: // Withdraw money and subtract from balance
                        balance -= withDraw(balance);
                    break;
                case 4: // Exit the program
                        System.out.println("Thank you! Have a nice day!");
                    break;
                default:// Handle invalid menu choices 
                        System.out.println("That was not a valid choice.");
                    break;            
            }
        
        }while(choice != 4); // Continue looping until the user chooses to exit

        scanner.close(); // Close the scanner to prevent memory leaks

    }

    // Method to display the current balance
    static void showBalance(double balance){
        System.out.printf("The balance is: %.2f\n", balance);
    }

    // Method to deposit money into the account
    static double deposit(){

        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        // Check for negative amounts
        if(amount < 0){
            System.out.println("The amount can not be negative.");
            return 0;
        }
        else{
            return amount;
        }
    }

    // Method to withdraw money from the account
    static double withDraw(double balance){

        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        // Check if there are sufficient funds
        if(balance < amount){
            System.out.println("INSUFFICIENT FUNDS!");
            return 0;
        }
        // Check for negative withdrawal amounts
        else if(amount < 0){
            System.out.println("The amount can not be negative.");
            return 0;
        }
        else{
            return amount;
        }
    }
}