package com.takeo.week2.day3;

import java.util.Scanner;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter two numbers to get Fibonacci series: ");
        String numbers = scanner.nextLine();

        String[] arrayNumbers = numbers.split(",");

        int num1 = Integer.parseInt(arrayNumbers[0]);
        int num2 = Integer.parseInt(arrayNumbers[1]);


        String series = String.valueOf(num1) + "," + String.valueOf(num2);

        for (int i = 1; i <= 10; i++) {
            int num3 = num1 + num2;
            series = series + "," + String.valueOf(num3);

            num1 = num2;
            num2 = num3;

        }

        System.out.println(series);
        scanner.close();

    }
}
