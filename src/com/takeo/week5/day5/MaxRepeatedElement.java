package com.takeo.week5.day5;



import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxRepeatedElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(0,0,0,0,0,3, 7, 7, 5, 9, 5);
        System.out.println("Max repeated number = "+findMaxRepeatedElement(numbers));


    }
    public static int findMaxRepeatedElement(List<Integer> list){

        int maxRepNum =0;
        int count =0;
        int maxRepTime =0;

        Map<Integer, Integer> maps = new HashMap<>();

        for(Integer number: list){

            if(maps.containsKey(number)){
                count = maps.get(number)+1;
                maps.put(number,count );

                if(count > maxRepTime){
                    maxRepTime =count;
                    maxRepNum = number;
                }

            }
            else{
                maps.put(number, 1);
            }

        }

        return maxRepNum;
    }
}
/*
Exercise 2: WAP in java to find the element in a list which is repeated max time in list.
        List<Integer> numbers = Arrays.asList(3, 7, 7, 5, 9, 5, 7);
        o/p -> 7 will be the answer here ,as 7 is repeated 3 times here ,which is max.
 */