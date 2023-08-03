package com.takeo.week2.day2;
///Exercise 1. Write a program in Java to find the factorial of a number.
//Factorial :  The product of all positive integers less than or equal to a
// given positive integer.
//Ex: 2! (2 Factorial) = 2*1 = 2
//    3! = 3*2*1 = 6
//    4! = 4*3*2*1 = 24
//Hint : Use for loop

import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer to find its factorial: ");
        int num = scanner.nextInt();
        scanner.close();

        long factorial = 1; // We use 'long' to handle larger factorial values

        for (int i = 1; i <= num; i++) {
            factorial =factorial * i; // Multiply the current value of 'factorial' by 'i'
        }

        System.out.println(num + "! = " + factorial);
    }
}






