package com.takeo.task.challenge2;
//Student Grading
//
//Scenario: You are developing a student grading application for a teacher. You need to implement a feature that calculates the average grade of students in a class.
//Given : Grades for Five Students as : 8,9,5,4,8
//Task: Write a program that calculates their average grade. Print the average grade.
//// here also use appropriate data type.
public class StudentGrading {
    public static void main(String[] args) {
        // Given grades for five students
        int grade1 = 8;
        int grade2 = 9;
        int grade3 = 5;
        int grade4 = 4;
        int grade5 = 8;

        // Calculate the sum of grades
        int sumGrades = grade1 + grade2 + grade3 + grade4 + grade5;

        // Calculate the average grade
        double averageGrade = (double) sumGrades / 5;

        // Print the average grade
        System.out.println("Average grade: " + averageGrade);
    }
}
