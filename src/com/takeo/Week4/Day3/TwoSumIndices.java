package com.takeo.Week4.Day3;
//Given an array of integers, find two numbers that add up
// to a specific target sum. Return the indices of the two numbers. For example, if the input is [2, 7, 11, 15]
// and the target is 9, the function should return [0, 1].

import java.util.HashMap;
import java.util.Map;

public class TwoSumIndices {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = findTwoSumIndices(nums, target);

        if (result != null) {
            System.out.println("Indices of the two numbers: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }

    public static int[] findTwoSumIndices(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), i};
            }
            numToIndex.put(nums[i], i);
        }

        return null;
    }
}
