package com.takeo.Week4.Day1;
// Custom Class - Student
//Create a custom class Student with the following attributes:
// name (String), age (int), and grade (double). Implement a Java
// program that uses an ArrayList to store a list of students and performs the following tasks:
//Create and add several student objects to the ArrayList.
//Find and print the average grade of all students.
//Print the name and age of all students who have a grade higher than 90.

import java.util.ArrayList;

class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 18, 95.5));
        students.add(new Student("Bob", 20, 87.0));
        students.add(new Student("Charlie", 19, 92.3));
        students.add(new Student("David", 21, 78.8));
        students.add(new Student("Eve", 22, 98.9));

        double totalGrade = 0.0;
        for (Student student : students) {
            totalGrade += student.getGrade();
        }
        double averageGrade = totalGrade / students.size();
        System.out.println("Average grade of all students: " + averageGrade);

        System.out.println("Students with grade higher than 90:");
        for (Student student : students) {
            if (student.getGrade() > 90) {
                System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
            }
        }
    }
}
