package com.takeo.week2.day2;
//Exercise 3. Write a program in Java to find the largest and smallest elements in an array.
//Ex : input = {1,9,5,7,8};
//     output = largest number = 9 & smallest number = 1
//Hint : use for loop and array here. take first element as largest and smallest and then inside loop compare and
//       if largest or smaller, then set that value to respective largest or smallest.

public class FindLargestAndSmallest {

    public static void main(String[] args) {
        int[] inputArray = {1, 9, 5, 7, 8};
        int largest = inputArray[0]; // Initialize largest with the first element
        int smallest = inputArray[0]; // Initialize smallest with the first element

        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > largest) {
                largest = inputArray[i]; // Update largest if the current element is greater
            }
            if (inputArray[i] < smallest) {
                smallest = inputArray[i]; // Update smallest if the current element is smaller
            }
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}