package com.takeo.week3.Day5;
//Exercise 3:
//Given an array of ints, return true if the
// array is length 1 or more, and the
// first element and the last element are equal.
//sameFirstLast([1, 2, 3]) → false
//sameFirstLast([1, 2, 3, 1]) → true
//sameFirstLast([1, 2, 1]) → true

public class Exercise3 {

        public static boolean sameFirstLast(int[] nums) {
            // Check if the array length is 1 or more
            if (nums.length >= 1) {
                // Compare the first and last elements
                if (nums[0] == nums[nums.length - 1]) {
                    return true;
                }
            }
            return false;
        }

        public static void main(String[] args) {
            System.out.println(sameFirstLast(new int[]{1, 2, 3}));    // Output: false
            System.out.println(sameFirstLast(new int[]{1, 2, 3, 1})); // Output: true
            System.out.println(sameFirstLast(new int[]{1, 2, 1}));    // Output: true

    }
}
