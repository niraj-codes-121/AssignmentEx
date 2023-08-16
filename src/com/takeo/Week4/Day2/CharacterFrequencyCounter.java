package com.takeo.Week4.Day2;
//5. Given a string, count the frequency of each character using a map.

import java.util.*;

public class CharacterFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c); // Consider characters in lowercase
                charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        // Print the character frequencies
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
    }
}
