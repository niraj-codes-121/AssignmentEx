package com.takeo.week5.day3;
//Write a program that takes two lists of integers as input and finds the common elements between them.
//Ex: List<Integer> list1 = List.of(1,4,6,3,7,8);
//    List<Integer> list1 = List.of(2,5,8,2,5,6);
//
//output : common elements in two list = 6,8

import java.util.*;

public class CommonElementsInLists {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 4, 6, 3, 7, 8);
        List<Integer> list2 = List.of(2, 5, 8, 2, 5, 6);

        Set<Integer> commonElements = findCommonElements(list1, list2);

        System.out.print("Common elements in two lists: ");
        for (Integer element : commonElements) {
            System.out.print(element + " ");
        }
    }

    public static Set<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
        Set<Integer> commonElements = new HashSet<>();

        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);

        for (Integer num : set1) {
            if (set2.contains(num)) {
                commonElements.add(num);
            }
        }

        return commonElements;
    }
}
