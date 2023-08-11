package com.takeo.week2.day4;
//Exercise 2: Write a java program that takes the base and height of a triangle and
// return its area.(area of triangle = (base*height)/2)
//
//Ex :
//triArea(3, 2) ➞ 3

public class TriangleAreaCalculator {
    public static double triArea(double base, double height) {
        double area = (base * height) / 2.0;
        return area;
    }

    public static void main(String[] args) {
        double base = 3.0;
        double height = 2.0;
        double area = triArea(base, height);
        System.out.println("The area of the triangle with base " + base + " and height " + height + " is: " + area);
    }
}