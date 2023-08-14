package com.takeo.Week4.Day3;
// You are given a list of integers where all numbers appear twice except for one.
// Your task is to find and return the integer that appears only once.

public class FindSingleElement {
    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 2, 5};
        int result = findSingleElement(nums);
        System.out.println("The integer that appears only once is: " + result);
    }

    public static int findSingleElement(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR operation
        }
        return result;
    }
}
