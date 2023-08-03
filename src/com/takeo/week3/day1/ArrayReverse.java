package com.takeo.week3.day1;

//Exercise 6 : Write a program to check print array in reverse order.
//Ex : {5,6,7,8} -> {8,7,6,5}
//hint : use for loop with decrement operator

public class ArrayReverse {
    public class ArrayPrintReverse {
        public static void main(String[] args) {
            int [] numbers = {5,6,7,8};

            for (int i = numbers.length-1; i >=0; i--){
                System.out.println(numbers[i]);
            }

        }
    }

}
