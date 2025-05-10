import java.util.Scanner; // Import the Scanner class for user input
import java.util.Random; // Import the Random class for generating random numbers

public class Main {
    public static void main(String[] args) {

        // Create a Random object to generate random numbers
        Random random = new Random();

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Variables to store the user's guess, attempt count, and maximum number
        int guess;
        int attempts = 0;
        int max = 100;

        // Generate a random number between 1 and 100 (both inclusive)
        int randomNumber = random.nextInt(max + 1) + 1;

        // Print the game introduction
        System.out.println("---Number Guessing Game---");
        System.out.println("Guess a number between 1-100");

        // Main game loop
        do{

            // Prompt the user to enter their guess
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++; // Increase the attempt counter by 1

            // Check if the guess is too high
            if(guess > randomNumber){
                System.out.println("Too high! Try again!");
            }
            // Check if the guess is too low
            else if(guess < randomNumber){
                System.out.println("Too low! Try again!");
            }
            // If the guess is correct
            else{
                System.out.println("Your guess is right!!!:D The number was: "+ randomNumber);
                System.out.println("Attempts: "+ attempts);
            }

        // Keep looping until the correct number is guessed
        }while(guess != randomNumber);

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}