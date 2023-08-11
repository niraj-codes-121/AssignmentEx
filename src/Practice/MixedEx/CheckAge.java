package Practice.MixedEx;

import java.util.Scanner;

public class CheckAge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age <= 13) {
            System.out.println("You are Child");
             }
        else if (age <= 30) {
            System.out.println("You are Young");
            }
        else if (age <= 50) {
            System.out.println("You are Middle");
            }
        else if (age  <= 100) {
            System.out.println("You are Old");
            }
        else {
            System.out.println("Please enter a valid age");
        }
    }
}