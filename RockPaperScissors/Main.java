import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Create a Random object for computer's choice
        Random random = new Random(); 

        // Define the possible choices for the game
        String[] choices = {"rock", "paper", "scissor"};
        
        // Variable to control the game loop
        String playAgain = "yes";

        // Main game loop
        do{

            // Get player's move and convert to lowercase
            System.out.print("Enter your move (rock, paper, scissor): ");
            String playerChoice = scanner.nextLine().toLowerCase();

            // Check if the player's move is valid
            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissor")){
                System.out.println("Invalid choice:(");
                continue;
            }

            // Get the computer's move by selecting a random choice
            String computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            // Determine the winner
            if(playerChoice.equals(computerChoice)){
                System.out.println("It is a tie!");
            }
            else if((playerChoice.equals("rock") && computerChoice.equals("scissor")) || 
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) || 
                    (playerChoice.equals("scissor") && computerChoice.equals("paper"))){

                System.out.println("You win!");
            }
            else{
                System.out.println("You lose!");
            }

            // Ask if the player wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

        }while(playAgain.equals("yes")); // Continue if the player says "yes"

        // End of the game
        System.out.println("Thanks for playing:)");

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}