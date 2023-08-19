package com.takeo.task.challenge2;
//Exercise 6: Design a calulator which perform a set of operations dynamically.
//Scenario: Design a Calculator class. Take inpit from user like :
//          Enter first number = 5
//          Enter Second number = 5
//          Enter Operation you want to perform = +
//
//Outupt of Program will be like this :
//
//          Output: 5+5 = 10;
//
//Hint :   take input by using Scanner class
//         take operation(+,-,*,/) as String input from the console
//         use if else cases to compare operation with constant String like : final String SUM = "+"; similar for other
//         then inside if do the required operation
//         print the output.
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");
        String operation = scanner.next();

        double result = 0.0;

        if (operation.equals("+")) {
            result = num1 + num2;
        } else if (operation.equals("-")) {
            result = num1 - num2;
        } else if (operation.equals("*")) {
            result = num1 * num2;
        } else if (operation.equals("/")) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Cannot divide by zero.");
                System.exit(0);
            }
        } else {
            System.out.println("Invalid operation.");
            System.exit(0);
        }

        System.out.println("Output: " + num1 + operation + num2 + " = " + result);

        scanner.close();
    }
}
