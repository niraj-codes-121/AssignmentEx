package com.takeo.week3.day1;

import java.util.Scanner;

// Write a program that takes a string and a character as input and counts and
// prints the number of occurrences of that character in the string.
//Ex : Deepak and e  -> output 2
//hint : use loops
public class Occurance {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a String:");
        String inputString=scanner.nextLine();
        System.out.println("Enter character Count:");
        char characterCount= scanner.next().charAt(0);

        int count=0;
        for(int i=0; i<inputString.length(); i++){
            if(inputString.charAt(i)==characterCount){
                count++;
            }
        }
        System.out.println("Number of occurance:'" + characterCount +"':"+count);
        scanner.close();


    }
}
