package takeo.assignment2;
//Write a Java program that calculates the simple interest based on the principal amount,
// rate of interest, and time period provided by the user.
//Instructions:
//Use the Scanner class to take input from the user for the principal amount, rate of interest, and time period (in years).
//Calculate the simple interest using the formula: Simple Interest = (Principal * Rate * Time) / 100.
//Display the calculated simple interest to the user.
//Ex: Enter the principal amount: 5000
//    Enter the rate of interest: 8.5
//    Enter the time period (in years): 2
//    Simple Interest: 850.0

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // to take input from user scanner object

        System.out.println("Please Enter The Principal amount:"); //prompt user tto enter P amount
        double principal = scanner.nextDouble();

        System.out.println("Please Enter The Rate of Interest:"); //prompt user to enter rate
        double  rate= scanner.nextDouble();

        System.out.println("Please Enter The Time Period:"); //prompt user to enter time
        double time = scanner.nextDouble();

        double Simple_Interest = (principal*rate*time)/100; //display formula for si

        System.out.println("The Simple Interest is:" + Simple_Interest);

        scanner.close(); // Close the Scanner object to free up resources


    }

}
