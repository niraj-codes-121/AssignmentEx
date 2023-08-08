package com.takeo.week3.Day5;
//Write a Java program that finds the
// maximum element in an ArrayList of integers.

import java.util.ArrayList;
import java.util.Collections;

public class Exercise1 {
    public static void main(String[] args) {
       ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);
        numbers.add(5);
        numbers.add(9);
        int max = findMaxElement(numbers);
        System.out.println("The maximum element is:" + max);
    }

    public static int findMaxElement(ArrayList<Integer> list) {

    return Collections.max(list);// Using Collections.max to find the maximum element in the ArrayList
}
}



