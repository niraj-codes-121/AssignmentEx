package com.takeo.Week4.Day2;

//2. Write a Java program that takes a list of integers,
// removes duplicate values, and prints the result using a set.
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of integers separated by spaces: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] numbers = input.split("\\s+");
        List<Integer> integerList = new ArrayList<>();

        for (String number : numbers) {
            try {
                int num = Integer.parseInt(number);
                integerList.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + number);
            }
        }

        Set<Integer> uniqueNumbers = new HashSet<>(integerList);

        System.out.println("Unique values: " + uniqueNumbers);
    }
}
