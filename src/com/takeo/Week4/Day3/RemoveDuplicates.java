package com.takeo.Week4.Day3;
//WAP to remove even numbers for a list of integers

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

        List<Integer> uniqueNumbers = removeDuplicates(numbers);

        System.out.println("Original list of integers: " + numbers);
        System.out.println("List with duplicates removed: " + uniqueNumbers);
    }

    public static List<Integer> removeDuplicates(List<Integer> inputList) {
        Set<Integer> uniqueSet = new HashSet<>(inputList);
        return new ArrayList<>(uniqueSet);
    }
}
