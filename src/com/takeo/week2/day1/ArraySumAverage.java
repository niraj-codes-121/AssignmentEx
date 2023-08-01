package com.takeo.week2.day1;


import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create the array with the given size
        int[] array = new int[size];

        // Get elements from the user and store them in the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Calculate the sum and average of the elements
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / size;

        // Print the sum and average
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}