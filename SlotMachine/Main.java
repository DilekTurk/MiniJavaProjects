import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Initial player balance
        int balance = 100;

        // Print game introduction
        System.out.println("***********************");
        System.out.println(" Welcome to Java Slots ");
        System.out.println(" Symbols: ! # $ ½ £ ");
        System.out.println("***********************");

        // Main game loop
        while(balance > 0){
            // Display the current balance
            System.out.println("Current balance: $"+ balance);
            System.out.print("Place your bet amount: ");
            int bet = scanner.nextInt(); // Get the player's bet
            scanner.nextLine(); // Clear the input buffer

            // Check if the bet is valid
            if(bet > balance){
                System.out.println("INSUFFICIENT FUNDS!");
                continue; // Restart the loop
            }
            else if(bet <= 0){
                System.out.println("Bet must be greater than 0.");
                continue; // Restart the loop
            }
            else{
                balance -= bet; // Deduct the bet from the balance
            }

            // Spin the slot machine
            System.out.println("Spinning...");
            String[] row = spinRow();
            printRow(row); // Print the result of the spin

            // Calculate the payout
            int payout = getPayout(row, bet);

            // Update balance based on the payout
            if(payout > 0){
                System.out.println("You won: $" + payout);
                balance += payout;
            }
            else{
                System.out.println("Sorry, you lost this round.");
            }

            // Ask the player if they want to play again
            System.out.println("Do you want to play again? (Y/N): ");
            String playAgain = scanner.nextLine().toUpperCase();

            // Exit the loop if the player doesn't want to play again
            if(!playAgain.equals("Y")){
                break;
            }
        }

        // Print the final balance and close the scanner
        System.out.println("GAME OVER! Your current balance is $" + balance);
        scanner.close();
    } 

    // Function to simulate a slot machine spin
    static String[] spinRow(){

        String[] symbols = {"!", "#", "$", "½", "£"};
        String[] row = new String[3];
        Random random = new Random();

        // Fill the row with random symbols
        for(int i=0; i<3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    // Function to print the row of symbols
    static void printRow(String[] row){
        System.out.println("***************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("***************");
    }

    // Function to calculate the payout based on the row
    static int getPayout(String[] row, int bet){
        
        // Check for three matching symbols
        if((row[0].equals(row[1])) && (row[0].equals(row[2]))){
            switch(row[0]){
                case "!": return bet *= 3;
                case "#": return bet *= 4;
                case "$": return bet *= 5;
                case "½": return bet *= 10;
                case "£": return bet *= 20;
                default: return 0;
            }
        }
        // Check for two matching symbols (first two)
        else if((row[0].equals(row[1]))){
            switch(row[0]){
                case "!": return bet *= 2;
                case "#": return bet *= 3;
                case "$": return bet *= 4;
                case "½": return bet *= 5;
                case "£": return bet *= 10;
                default: return 0;
            }
        }
        // Check for two matching symbols (last two)
        else if((row[1].equals(row[2]))){
            switch(row[1]){
                case "!": return bet *= 2;
                case "#": return bet *= 3;
                case "$": return bet *= 4;
                case "½": return bet *= 5;
                case "£": return bet *= 10;
                default: return 0;
            }
        }
        // No matching symbols
        return 0;
    }
}