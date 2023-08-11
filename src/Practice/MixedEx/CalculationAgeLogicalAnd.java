package Practice.MixedEx;

import java.util.Scanner;

public class CalculationAgeLogicalAnd {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Your Age Please:");
        int age = scanner.nextInt();
        if (age >= 1 && age <= 13) {
            System.out.println("Child");
            }
        else if (age > 13 && age <= 30) {
            System.out.println("Young");
            }
        else if (age>30 && age <=50){
            System.out.println("middle");
            }
        else if (age>50 && age<=100){
            System.out.println("old");
            }
        else {
            System.out.println("Please enterr the valid age:");
        }


    }
}
