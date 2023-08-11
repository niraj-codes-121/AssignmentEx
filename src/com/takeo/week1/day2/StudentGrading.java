package com.takeo.week1.day2;
//Exercise 4: Student Grading
//Scenario: You are developing a student grading application for a teacher.
// You need to implement a feature that calculates the average grade of students in a class.
//Given : Grades for Five Students as : 8,9,5,4,8
//Task: Write a program that calculates their average grade. Print the average grade.
//// here also use appropriate data type.
public class StudentGrading {
    public static void main(String[] args) {
        int numberOfStudents = 5; // given there are 5 students
        double grade1 = 8;
        double grade2 = 9;
        int grade3 = 5;
        double grade4 = 4;
        double grade5 = 8;

        // Calculate the sum of all grades
        double sum = grade1 + grade2 + grade3 + grade4 + grade5;

        // Calculate the average and print it
        double average = sum / numberOfStudents;
        System.out.println("Average grade: " + average);  // result Average grade: 6.8


    }
}

