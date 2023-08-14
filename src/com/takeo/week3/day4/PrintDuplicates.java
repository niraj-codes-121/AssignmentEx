package com.takeo.week3.day4;

public class PrintDuplicates {
    public static void main(String[] args) {
        int [] numbers = {11,12,13,14,14,15,15,81,18,81, 11};

        for ( int i =0; i< numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    System.out.println(numbers[i]);
                }
            }
        }

    }
}