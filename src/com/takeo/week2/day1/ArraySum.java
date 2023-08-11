package com.takeo.week2.day1;

import java.util.Scanner;

    public class ArraySum {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask the user to enter the length of the array
            System.out.print("Enter the length of the array: ");
            int length = scanner.nextInt();

            int[] a = new int[length];

            // Prompt the user to enter each element of the array
            for (int i = 0; i < length; i++) {
                System.out.print("Enter the element ["+ i + "] ");
                a[i] = scanner.nextInt();
            }

            // Calculate the sum of all elements in the array
            int sum = 0;
            for (int i = 0; i < length; i++) {
                sum += a[i];
            }
            // Print the sum of elements in the array
            System.out.println("Sum of elements in the array: " + sum);
        }
    }