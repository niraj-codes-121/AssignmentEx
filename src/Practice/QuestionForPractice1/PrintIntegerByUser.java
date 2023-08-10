package Practice.QuestionForPractice1;

import java.util.Scanner;

//Write a program to print an integer entered by the user.
//Write a program to print String entered by the user.
public class PrintIntegerByUser {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the userinput:");
        int userInput= sc.nextInt();
        System.out.println("Enter the userinput:" +userInput);
        sc.close();





    }
}
