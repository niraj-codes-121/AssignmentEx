package com.takeo.week2.day4;

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