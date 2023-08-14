package com.takeo.Week4.Day2;
//Given a list of integers and a target sum,
// find two numbers in the list that add up to the target sum.

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 6, 3};
        int target = 9;

        int[] result = findTwoSum(nums, target);

        if (result != null) {
            System.out.println("Indices of the two numbers: " + result[0] + ", " + result[1]);
            System.out.println("The two numbers are: " + nums[result[0]] + ", " + nums[result[1]]);
        } else {
            System.out.println("No solution found.");
        }
    }

    public static int[] findTwoSum(int[] nums, int target) {
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
