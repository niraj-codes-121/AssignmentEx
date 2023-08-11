package com.takeo.week2.day3;
//Exercise 2:In this challenge, a farmer is asking you to tell him how many legs
// can be counted among all his animals. The farmer breeds three species:
//chickens = 2 legs
//cows = 4 legs
//pigs = 4 legs
//The farmer has counted his animals and he gives you a subtotal for each species.
// You have to implement a function that returns the total number of legs of all the animals.
//
//animals(2, 3, 5) ➞ 36

public class CountLegs {
    public static int totalLegs( int a, int b, int c) {
        return (a * 2) + (b * 4) + (c * 4);
    }

        public static void main(String[] args){

            System.out.println("total legs:" + totalLegs(2, 4, 4));
        }
    }
