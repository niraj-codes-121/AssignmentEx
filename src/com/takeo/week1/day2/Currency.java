package com.takeo.week1.day2;
//Scenario: You are developing a currency converter application, and
// you need to implement a feature that converts a given amount in one
// currency to another currency.
//Given : USD value = 10
//Task: Write a program that converts currency to another currency based
// on the exchange rate. The exchange rate should be stored as a constant
// variable. Print the converted amount.
////you can convert USD-Rupees and use proper data type

public class Currency {
    public static void main(String[] args) {
        double d=10;
        final double rate= 130;
        double rupees =rate*d;

        System.out.println("The converted rupees is:" +rupees);

    }
}
