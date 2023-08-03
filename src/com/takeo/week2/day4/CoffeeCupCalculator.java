package com.takeo.week2.day4;

public class CoffeeCupCalculator {
    public static int totalCups(int boughtCups) {

        int freeCups = boughtCups / 6; // Calculate how many sets of 6 cups you have purchased
        int totalCups = boughtCups + freeCups; // Add the free cups (1 free cup per set of 6 cups)
        return totalCups;
    }
    public static void main(String[] args) {
        int boughtCups = 6;
        int totalCups = totalCups(boughtCups);
        System.out.println("If you buy " + boughtCups + " cups, you will get a total of " + totalCups + " cups.");
    }
}