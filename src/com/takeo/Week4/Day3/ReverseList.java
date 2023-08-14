package com.takeo.Week4.Day3;
//WAP to reverse list of integers.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Original list: " + numbers);

        reverseList(numbers);

        System.out.println("Reversed list: " + numbers);
    }

    public static void reverseList(List<Integer> inputList) {
        Collections.reverse(inputList);
    }
}
