package com.takeo.week2.day4;
//Exercise 1: Write a java program that takes an integer hours and converts it to seconds.
//
//Ex :
//convert(5) ➞ 18000

public class HoursToSecondsConverter {
    public static int convert(int hours) {
        int seconds = hours * 3600; // 1 hour = 3600 seconds given
        return seconds;
    }

    public static void main(String[] args) {
        int hours = 5;
        int seconds = convert(hours);
        System.out.println("Converted " + hours + " hours to " + seconds + " seconds.");
    }
}

