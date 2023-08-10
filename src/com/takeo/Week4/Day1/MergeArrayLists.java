package com.takeo.Week4.Day1;
//Write a Java program that merges two ArrayLists of integers
// and prints the resulting merged ArrayList

import java.util.ArrayList;

public class MergeArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);

        ArrayList<Integer> mergedList = mergeArrayLists(list1, list2);

        System.out.println("Merged ArrayList: " + mergedList);
    }

    public static ArrayList<Integer> mergeArrayLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> mergedList = new ArrayList<>();

        for (Integer num : list1) { // Add elements from list1 to the mergedList
            mergedList.add(num);
        }

        // Add elements from list2 to the mergedList
        for (Integer num : list2) {
            mergedList.add(num);
        }

        return mergedList;
    }
}