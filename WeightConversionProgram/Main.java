import java.util.Scanner; // Import the Scanner class for reading user input

public class Main {

    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Print the program header
        System.out.println("---Weight Conversion Program---");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        // Prompt the user to choose a conversion option
        System.out.print("Choose an option: ");
        int option = scanner.nextInt();

        // Declare variables for weight and converted weight
        double weight;
        double newWeight;

        // Check which conversion option the user selected
        if(option == 1){
            // Convert lbs to kgs
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs: %.2f", newWeight);
        }
        else if(option == 2){
            // Convert kgs to lbs
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs: %.2f", newWeight);
        }
        else{
            // Handle invalid input
            System.out.println("That was not a valid option.");
        }

        // Close the scanner to free system resources
        scanner.close();
        
    }
}