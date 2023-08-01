package com.takeo.week2.day1;

public class EvenOddChecker {

    public static void checkEvenOdd(int[] arr) {
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.println(num + " is even.");
            } else {
                System.out.println(num + " is odd.");
            }
        }
    }

    public static void main(String[] args) {
        int[] sampleArray = { 2, 5, 10, 7, 4 };
        checkEvenOdd(sampleArray);
    }
}