package com.takeo.task.challenge2;
//Exercise 1: Temperature Conversion
//Scenario: You are building a weather application, and you need to implement a feature that converts temperature values from Celsius to Fahrenheit.
//Given : You can take temperature of your city in Celsisus.
//Task: Write a program that converts Celsisus to Fahrenheit using the formula (Celsius * 9/5) + 32, and prints the converted temperature.
//// use proper data type for this as we can have decimal value there.

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Calculate temperature in Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Print the converted temperature
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        // Close the Scanner
        scanner.close();
    }
}
