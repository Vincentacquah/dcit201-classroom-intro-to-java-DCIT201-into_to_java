import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Temperature Converter!");

        // Variable to store the user's choice
        int choice = 0;
        
        // Loop until the user provides a valid choice
        while (true) {
            try {
                // Prompt user to choose conversion type
                System.out.println("Please choose an option:");
                System.out.println("1. Convert Celsius to Fahrenheit");
                System.out.println("2. Convert Fahrenheit to Celsius");
                System.out.print("Enter your choice (1 or 2): ");
                choice = Integer.parseInt(scanner.nextLine());

                // Validate choice
                if (choice == 1 || choice == 2) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number (1 or 2).");
            }
        }

        // Variable to store the temperature
        double temperature = 0.0;

        // Loop until the user provides a valid temperature
        while (true) {
            try {
                // Prompt user to enter the temperature
                System.out.print("Enter the temperature: ");
                temperature = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric temperature.");
            }
        }

        // Perform the conversion based on user's choice
        if (choice == 1) {
            // Celsius to Fahrenheit
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit.%n", temperature, fahrenheit);
        } else if (choice == 2) {
            // Fahrenheit to Celsius
            double celsius = (temperature - 32) * 5 / 9;
            System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius.%n", temperature, celsius);
        }

        // Close the Scanner
        scanner.close();
        
        System.out.println("Thank you for using the Temperature Converter!");
    }
}
