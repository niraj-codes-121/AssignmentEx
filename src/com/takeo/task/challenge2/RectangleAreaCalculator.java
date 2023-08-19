package com.takeo.task.challenge2;
//Calculate Area of a Rectangle
//Scenario: You are designing a floor planning tool, and you need to calculate the area of a rectangle-shaped room.
//Given : Take length as 20 and breadth as 40.
//Task: Write a program that will calculates rectangle area. Print the calculated area.
public class RectangleAreaCalculator {
    public static void main(String[] args) {
        // Given length and breadth
        double length = 20.0;
        double breadth = 40.0;

        // Calculate the area of the rectangle
        double area = length * breadth;

        // Print the calculated area
        System.out.println("Area of the rectangle: " + area);
    }
}

