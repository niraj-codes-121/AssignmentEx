package com.takeo.week2.day2;
//Exercise 5: ArraySumAverage
//Create a Java program that takes an array of integers as input from the user,
//calculates the sum and average of the elements, and prints the results.

import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        // Ask the user to enter elements of the array
        System.out.println("Enter " + size + " integers with Space:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum of the elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        // Calculate the average of the elements
        double average = (double) sum / size;

        // Print the results
        System.out.println("Sum of the elements: " + sum);
        System.out.println("Average of the elements: " + average);

        scanner.close();
    }
}