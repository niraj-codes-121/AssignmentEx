package com.takeo.week3.day1;
//Exercise 3 : Write a program that prints the multiplication table of a given number.
//
//Ex : 2*1 = 2
//      2*2 = 4 and so on.
//
//hint : use for loop


import java.util.Scanner;
    public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }

        scanner.close();
    }
}