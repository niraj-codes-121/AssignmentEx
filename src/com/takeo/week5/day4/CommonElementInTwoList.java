package com.takeo.week5.day4;

import java.sql.Timestamp;
import java.util.*;
import java.util.stream.Collectors;

public class CommonElementInTwoList {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,4,6,3,7,8);
        List<Integer> list2 = List.of(2,5,2,5,6,7);
        // findCommonElementFromTwoList(list1,list2);
        // findCommonElement(list1,list2);

        List<Integer> commonList =  findCommonElementUsingSet(list1,list2);
        //System.out.println(commonList);

        //List<Integer> commonElements = new ArrayList<>(list1);
        //commonElements.retainAll(list2);
        // System.out.println(commonElements);

//Using Stream
        List<Integer> commonElements = list1.stream()
                .distinct() //Removes duplicates from the first list.
                .filter(list2::contains) // Filters elements that are also present in the second list.
                .collect(Collectors.toList()); //Collects the filtered elements into a list.
        System.out.println(commonElements);

        Date date = new Timestamp(System.currentTimeMillis());
        System.out.println(date);
    }
    public static void findCommonElementFromTwoList(List<Integer> listOne, List<Integer> listTwo){

        List<Integer> commonElement = new ArrayList<>();
        Iterator iteratorOne = listOne.iterator();
        while (iteratorOne.hasNext() ){
            Integer elementOne = (Integer) iteratorOne.next();
            Iterator iteratorTwo = listTwo.iterator();
            while (iteratorTwo.hasNext()){
                Integer elementTwo = (Integer) iteratorTwo.next();
                if (elementOne.equals(elementTwo)){
                    commonElement.add(elementOne);
                    break;
                }
            }
        }
        System.out.println(commonElement);

    }

    public static  void findCommonElement(List<Integer> list1, List<Integer> list2){
        Set<Integer> commonElement = new HashSet<>();
        for(Integer element1 : list1){
            for(Integer element2 : list2){
                if(element2.equals(element1)){
                    commonElement.add(element1);
                }
            }

        }
        System.out.println(commonElement);

    }

    public static List<Integer> findCommonElementUsingSet(List<Integer> list1, List<Integer> list2){

        List <Integer> commonList = new ArrayList<>();
        Set <Integer> setOne = new HashSet<>();

        for(Integer element:list1){
            setOne.add(element);
        }
        for(Integer element : list2){
            if(setOne.contains(element)){
                commonList.add(element);
            }
        }
        return commonList;
    }


}
/*
Exercise 2 : Write a program that takes two lists of integers as input and finds the common elements between them.
Ex: List<Integer> list1 = List.of(1,4,6,3,7,8);
    List<Integer> list1 = List.of(2,5,8,2,5,6);
output : common elements in two list = 6,8
 */