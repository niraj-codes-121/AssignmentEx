package com.takeo.week2.day3;
//Exercise 3: Write a Java Program to swap two numbers using the third variable.4
//Ex : x = 4 and y = 7
//     after swapping x = 7 , y = 4.


    public class SwapNumbers {
        public static void main(String[] args) {
            int x = 4;
            int y = 7;

            System.out.println("Before swapping: x = " + x + ", y = " + y);

            // Swapping logic using a third variable
            int temp = x;
            x = y;
            y = temp;

            System.out.println("After swapping: x = " + x + ", y = " + y);
        }

}
