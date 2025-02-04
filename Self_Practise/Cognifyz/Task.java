package Self_Practise.Cognifyz;

import java.util.Scanner;

public class Task {

    // Method to convert Celsius to Fahrenheit
    public static double celsius_ToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to to the Temperature Converter: \n");
        System.out.println("Enter the temperature value:");
        double tempValue = scanner.nextDouble();

        // Prompt user for the unit of temperature
        System.out.println("Value in Celsius or Fahrenheit? (C/F): ");
        char unit = scanner.next().toUpperCase().charAt(0);

        if (unit == 'C') {
            //convert celsius to fahrenheit.
            double convertedTemp = fahrenheitToCelsius(tempValue);
            System.out.println("%.2f°C is equal to %.2f°F%n = " + tempValue + convertedTemp);
        } else if (unit == 'F') {
            // Convert Fahrenheit to Celsius
            double convertedTemp = celsius_ToFahrenheit(tempValue);
            System.out.println("%.2f°F is equal to %.2f°C%n = " + tempValue + convertedTemp);
        } else
            System.out.println("Invalid unit. Please enter 'C' for Celsius or 'F' for Fahrenheit.");
    }
}
