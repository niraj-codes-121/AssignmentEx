package com.takeo.task.challenge2;


public class BillCalculator {
    public static void main(String[] args) {
        // Given values
        double billAmount = 30.0; // Example bill amount in dollars
        double taxes = 15.0; // Example tax amount in dollars
        double tip = 10.0; // Example tip amount in dollars

        // Calculate total bill amount
        double totalBill = billAmount + taxes + tip;

        // Print the total bill amount
        System.out.println("Total bill amount: $" + totalBill);
    }
}
