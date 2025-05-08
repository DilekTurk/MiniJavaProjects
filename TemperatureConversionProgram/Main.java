import java.util.Scanner; // Import the Scanner class for reading user input

public class Main {

    public static void main(String[] args) {
        
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Print the program header
        System.out.println("---Temperature Conversion Program---");

        // Prompt the user to enter the temperature value
        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        // Ask the user whether to convert to Celsius or Fahrenheit
        System.out.print("Convert to Celcius or Fahrenheit (C or F): ");
        String choice = scanner.next().toUpperCase();

        // Calculate the converted temperature using a ternary operator
        // If the choice is "C", convert Fahrenheit to Celsius
        // Otherwise, convert Celsius to Fahrenheit
        double newTemperature = (choice.equals("C")) ? (temperature - 32) * 5 / 9 : (temperature * 9 / 5) + 32;

        // Print the converted temperature with 2 decimal places
        System.out.printf("The new temperature is: %.2f°%s", newTemperature, choice);

        // Close the scanner to free system resources
        scanner.close();

    }
}