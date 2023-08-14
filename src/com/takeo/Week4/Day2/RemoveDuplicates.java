package com.takeo.Week4.Day2;
//Write a Java program that takes a list of integers, removes
// duplicate values, and prints the result using a set.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(2);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(9);
        numbers.add(2);

        List<Integer> uniqueNumbers = removeDuplicates(numbers);

        System.out.println("Original list of integers: " + numbers);
        System.out.println("List with duplicates removed: " + uniqueNumbers);
    }

    public static List<Integer> removeDuplicates(List<Integer> inputList) {
        Set<Integer> uniqueSet = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (Integer num : inputList) {
            if (uniqueSet.add(num)) {
                result.add(num);
            }
        }

        return result;
    }
}
