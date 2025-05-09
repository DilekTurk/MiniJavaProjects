import java.util.Scanner; // Import the Scanner class to read user input

public class Main {

    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        // Prompt the user to enter the operator
        System.out.print("Enter the operator (+, -, /, *): ");
        char operator = scanner.next().charAt(0);

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        double result = 0;
        boolean isValid = true; // This flag will check if the operator is valid or not

        // Perform the calculation based on the chosen operator
        switch (operator) {
            case '+': 
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '/':
                // Division, with a check for dividing by zero
                if(number2 == 0){
                    System.out.println("You cannot divide by 0.");
                    isValid = false; // Prevents the result from being printed
                }
                else{
                    result = number1 / number2;
                }
                break;
            case '*':
                result = number1 * number2;  
                break;      
            default:
                // If the operator is not one of the valid options
                System.out.println("That was not a valid operator.");
                isValid = false; // Prevents the result from being printed
                break;
        }

        // Print the result only if the operator was valid
        if (isValid) {
            System.out.printf("The result is: %.3f", result);
        }
        
        // Close the scanner to free up resources
        scanner.close();

    }
}