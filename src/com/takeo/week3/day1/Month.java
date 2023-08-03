package com.takeo.week3.day1;

import java.util.Scanner;

//Exercise 1 : create a simple program that takes a month number as input
// and prints the corresponding month name.If not found print invalid number.
//Ex : 1 -> January
//     2 -> February
//     13 -> Invalid
//Hint : use switch case for comparison
import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int monthNumber = scanner.nextInt();

        String month;
        switch (monthNumber) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "Invalid";
                break;
        }

        System.out.println("The corresponding month name is: " + month);

        scanner.close();
    }
}