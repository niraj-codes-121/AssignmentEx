package Practice.QuestionForPractice1;

import java.util.Scanner;

//Write a program to remove all whitespaces from the String.
public class RemoveWhiteSpace {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string with whitespaces: ");
            String input = scanner.nextLine();

            // Remove whitespaces using regular expression
            String result = input.replaceAll("\\s", "");

            System.out.println("String after removing whitespaces: " + result);

            scanner.close();
            //o/p=Enter a string with whitespaces: ads dad
        //String after removing whitespaces: adsdad
        }


}
