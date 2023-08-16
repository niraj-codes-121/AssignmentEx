package com.takeo.Week4.Day2;
//1. Write a Java program that takes a sentence as input and
// prints the frequency of each word using a map.
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Count the frequency of each word
        for (String word : words) {
            // Remove any punctuation marks
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            if (!word.isEmpty()) {
                wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
            }
        }

        // Print the word frequencies
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
