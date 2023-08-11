package com.takeo.week2.day2;

import java.util.Scanner;

//Exercise 4: VowelCounter
//Create a Java program that takes a sentence as input from the user,
//counts the number of vowels (a, e, i, o, u).
//"My name is Deepak"
public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        int vowelCount = countVowels(sentence);
        System.out.println("Number of vowels in the sentence: " + vowelCount);
    }

    public static int countVowels(String str) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (char vowel : vowels) {
                if (ch == vowel) {
                    count++;

                }
            }
        }

        return count;
    }
}