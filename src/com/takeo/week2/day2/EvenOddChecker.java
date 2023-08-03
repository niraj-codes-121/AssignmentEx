package com.takeo.week2.day2;

public class EvenOddChecker {

    public static void checkEvenOdd(int[] arr) {
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.println( " This is even."+num );
            } else {
                System.out.println("This is odd." +num);
            }
        }
    }

    public static void main(String[] args) {
        int[] sampleArray = { 2, 5, 10, 7, 4 };
        checkEvenOdd(sampleArray);
    }
}