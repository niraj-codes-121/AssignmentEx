package com.takeo.week2.day4;

public class CoffeeCupCalculator {
    public static int totalCups(int boughtCups) {
        int freeCups = boughtCups / 6;
        int totalCups = boughtCups + freeCups;
        return totalCups;
    }

    public static void main(String[] args) {
        int boughtCups = 6;
        int totalCups = totalCups(boughtCups);
        System.out.println("If you buy " + boughtCups + " cups, you will get a total of " + totalCups + " cups.");
    }
}