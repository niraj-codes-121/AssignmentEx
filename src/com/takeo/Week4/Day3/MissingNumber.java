package com.takeo.Week4.Day3;
//Given an array containing n distinct numbers taken
// from 0, 1, 2, ..., n, find the one that is missing from the array. For example,
// if the input is [3, 0, 1], the missing number is 2.

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int missing = findMissingNumber(nums);
        System.out.println("The missing number is: " + missing);
    }

    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
