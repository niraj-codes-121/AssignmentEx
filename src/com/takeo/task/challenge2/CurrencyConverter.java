package com.takeo.task.challenge2;
//Currency Converter
//Scenario: You are developing a currency converter application, and you need to implement a feature that converts a given amount in one currency to another currency.
//Given : USD value = 10
//Task: Write a program that converts currency to another currency based on the exchange rate. The exchange rate should be stored as a constant variable. Print the converted amount.
////you can convert USD-Rupees and use proper data type

public class CurrencyConverter {
    public static void main(String[] args) {
        // Exchange rate from USD to INR
        final double EXCHANGE_RATE = 74.5; // Example exchange rate

        // Given amount in USD
        double usdAmount = 10.0; // Example amount in USD

        // Convert USD to INR
        double inrAmount = usdAmount * EXCHANGE_RATE;

        // Print the converted amount in INR
        System.out.println("Converted amount in INR: " + inrAmount);
    }
}
