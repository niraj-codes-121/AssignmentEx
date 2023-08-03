package com.takeo.week2.day1;
//Coding exercise 1: Declare a String array and define names in it and search for a particular name in it.
//
//Ex : "ABC","XYZ","LION"
//I have to check in this array ,either "XYZ" exist or not.

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        String[] arr={"ABC", "XYZ", "LION"};
        boolean check= false;
        String toCheck="XYZ";
        for(String name : arr){
            if(name.equals(toCheck)){
                check = true;
                break;
            }
            if(check)
                System.out.println("XYZ");
        }



    }
}