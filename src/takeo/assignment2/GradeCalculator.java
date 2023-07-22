package takeo.assignment2;
//Exercise 2: Grade Calculator
//Write a Java program that calculates the grade based on the marks obtained by a student in an exam.
//The program should follow the standard grading system: A (90-100), B (80-89), C (70-79), D (60-69), F (below 60).
//Instructions:
//Use the Scanner class to take input from the user for the marks obtained.
//Determine the grade based on the marks using if-else statements.
//Display the calculated grade to the user.
//Ex: Enter the marks obtained: 85
//    Grade: B

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter The obtained Mark:");
        double mark = scanner.nextDouble();

        String Grade;
        if(mark>=90 && mark<=100){
            Grade ="A";
            }
        else if(mark>=80 && mark<=89){
            Grade = "B";
            }
        else if(mark>=70 && mark<=79){
            Grade = "C";
            }
        else if(mark>=60 && mark<=69){
            Grade ="D";
            }
        else {
            Grade= "F";
        }
        System.out.println("Your Grade is:" + Grade);
        scanner.close();
    }


}
