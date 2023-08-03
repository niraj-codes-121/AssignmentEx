package com.takeo.week2.day3;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {

        String name = "Deepak";
        boolean result = isPalindrome(name);
        System.out.println(result);
            }

            public static boolean isPalindrome(String str) {
                for (int i = 0; i < str.length() / 2; i++) {
                    if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                        return false;
                    }
                }
                return true;
            }
        }




