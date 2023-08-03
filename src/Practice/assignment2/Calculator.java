package Practice.assignment2;
//Exercise 6: Design a Calculator which perform a set of operations dynamically.
//   Scenario: Design a Calculator class. Take input from user like :
//   Enter first number = 5
//   Enter Second number = 5
//   Enter Operation you want to perform = +
//   Output of Program will be like this :
//   Output: 5+5 = 10;
//   Hint :   take input by using Scanner class
//take operation(+,-,*,/) as String input from the console
//    use if else cases to compare operation with constant String like : final String SUM = "+"; similar for other
//    then inside if you do the required operation
//    print the output.

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        //create a Scanner object to read the use input from the console
        Scanner scanner = new Scanner(System.in);

        //prompt the user to enter name
        System.out.println("Enter first number:");

        //use the scanner object to read the input from the user
        Double num1 = scanner.nextDouble();

        System.out.println("Enter Second number:");
        Double num2 = scanner.nextDouble();

        System.out.print("Enter operation you want to perform (+, -, *, /): ");
        String operation = scanner.next();

        double result = 0;

        if (operation.equals("+")) {
            result = num1 + num2;
            }
        else if (operation.equals("-")) {
            result = num1 - num2;
            }
        else if (operation.equals("*")) {
            result = num1 * num2;
            }
        else if (operation.equals("/")) {
             {
                result = num1 / num2;
            }
        }

        System.out.println("Output is: " + num1 + operation + num2 + " = " + result);


    }
}