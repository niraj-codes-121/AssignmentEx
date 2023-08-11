package com.takeo.week3.day2;
//write a program to search a particular
// element in an array : {1,9,4,8,5,7}
// find index of 4

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 9, 4, 8, 5, 7};
        int searchElement = 4;

        int index = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchElement) {
                index = i;
                break;
            }
        }

        if (index != 1) {
            System.out.println("Element " + searchElement + " found at index " + index);
        } else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }
    }
}




