import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // Array of quiz questions
        String[] questions = {"Which sentence is grammatically correct?", 
                              "What is the synonym of the word \"abundant\"?", 
                              "Which of the following is NOT a benefit of regular exercise?",
                              "What does the phrase \"break the ice\" mean?",
                              "Which word means \"a feeling of great happiness and excitement\"?"};

        // Array of answer options for each question
        String[][] options = {{"A) She go to the store yesterday.", "B) She went to the store yesterday.", "C) She goes to the store yesterday.", "D) She going to the store yesterday."}, 
                              {"A) Rare", "B) Scarce", "C) Plentiful", "D) Insufficient"}, 
                              {"A) Improved physical health", "B) Increased stress levels", "C) Better mental clarity", "D) Stronger immune system"}, 
                              {"A) To make someone angry", "B) To start a conversation in a relaxed way", "C) To end a relationship", "D) To cool down a situation"}, 
                              {"A) Gloom", "B) Euphoria", "C) Anger", "D) Anxiety"}};
        
        // Array of correct answers (answer key)
        char[] answerKey = {'B', 'C', 'B', 'B', 'B'};
        
        // Variable to track the user's score
        int score = 0;

        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("***************************");
        System.out.println("Welcome to Java Quiz Game!");
        System.out.println("***************************");

        // Loop through each question
        for(int i = 0; i < questions.length; i++){

            // Print the current question
            System.out.println(questions[i]);

            // Print the answer options for the current question
            for(String option : options[i]){
                System.out.println(option);
            }

            // Get the user's answer and convert it to uppercase
            System.out.print("Enter your guess: ");
            char guess = Character.toUpperCase(scanner.next().charAt(0));

            // Check if the guess is correct
            if(guess == answerKey[i]){
                System.out.println("********");
                System.out.println("CORRECT!");
                System.out.println("********");
                score++;
            }
            else{
                System.out.println("*******");
                System.out.println("WRONG!");
                System.out.println("*******");
            }
        }

        // Print the final score
        System.out.println("Your final score is: " + score + " out of " + questions.length);

        // Close the scanner to free up resources
        scanner.close();

    }
    
}





