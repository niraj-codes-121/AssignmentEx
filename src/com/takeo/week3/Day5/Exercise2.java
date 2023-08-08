package com.takeo.week3.Day5;
//Exercise 2:
//Given 2 ints, a and b, return true if one if
// them is 10 or if their sum is 10.
//makes10(9, 10) → true
//makes10(9, 9) → false
//makes10(1, 9) → true

public class Exercise2 {
        public static void main(String[] args) {
            System.out.println(makes10(9, 10)); // Output: true
            System.out.println(makes10(9, 9));  // Output: false
            System.out.println(makes10(1, 9));  // Output: true
        }

        public static boolean makes10(int a, int b) {
            return (a == 10 || b == 10 || a + b == 10);

    }
}
