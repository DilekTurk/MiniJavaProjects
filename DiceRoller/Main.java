import java.util.Random;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Create a Random object to generate random numbers
        Random random = new Random();

        // Prompt the user to enter the number of dice to roll
        System.out.print("Enter the number of dice to roll: ");
        int numberOfDice = scanner.nextInt();

        // Variable to store the total sum of rolled dice
        int total = 0;

        // Check if the number of dice is greater than 0
        if(numberOfDice > 0){

            // Display the number of dice to be rolled
            System.out.printf("Rolling %d dice...\n", numberOfDice);

            // Loop through the number of dice to roll each one
            for(int i = 0; i < numberOfDice; i++){

                // Generate a random number between 1 and 6
                int roll = random.nextInt(6) + 1;
                // Print the result of each roll
                System.out.println("You rolled: "+ roll);
                // Add the result to the total sum
                total += roll;
                        
            }
            // Print the total sum of all rolled dice
            System.out.println("Total: "+ total);
        }
        else{
            // Display an error message if the number of dice is not valid
            System.out.println("Number of dice must be greater than 0.");
        }
        // Close the scanner object to free resources
        scanner.close();
    }

}
