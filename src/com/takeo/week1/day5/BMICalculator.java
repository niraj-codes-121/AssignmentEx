package takeo.assignment2;
//Exercise 5: BMI(Body Mass Index) Calculator
//Write a Java program that calculates the Body Mass Index (BMI) of a person based on their weight and height.
//Instructions:
//Use the Scanner class to take input from the user for their weight in kilograms and height in meters.
//Create a method that takes the input weight and height as arguments and calculates the BMI using the formula:
// BMI = weight / (height * height).
//Ex:  Enter your weight (kg): 70
//     Enter your height (m): 1.75
//     Your BMI: 22.86

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the weight in kilograms:");
        double weight = scanner.nextDouble();

        System.out.println("Enter the height in meters:");
        double height = scanner.nextDouble();

        double Bmi = calculateBMI(weight, height);

        System.out.println("Your BMI: " + Bmi);
        scanner.close();
    }

        // Method to calculate BMI with parameter
        public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
}