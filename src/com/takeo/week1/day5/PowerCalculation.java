package takeo.assignment2;
//Exercise 4: Power Calculation
//Write a Java program that calculates the power of a given number raised to an exponent provided by the user.
//Instructions:
//Use the Scanner class to take input from the user for the base number and the exponent.
//Use a loop to calculate the power of the number raised to the exponent.
//Display the result to the user.
//Ex: Enter the base number: 2
//    Enter the exponent: 5
//    2^5 = 32

import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the Base Number:");
        double Base_Number = scanner.nextDouble();

        System.out.println("Enter the Exponent");
        double Exponent =scanner.nextDouble();

        double result =1;

        for (double i = 0; i < Exponent; i++) {
            result =result* Base_Number;
            }
        System.out.println(Base_Number + "^" + Exponent + " = " + result);

        scanner.close();


    }
}
