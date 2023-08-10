package Practice.QuestionForPractice1;


import java.util.Scanner;

//Write a program that finds simple interest.
// Formula= (p * t * r) / 100
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the principal:");
        double principal= sc.nextDouble();
        System.out.println("Enter the time:");
        double time= sc.nextDouble();
        System.out.println("Enter the rate:");
        double rate= sc.nextDouble();

        double simpleInterest =(principal*time*rate)/100;
        System.out.println("The formula of Simple Interest is:"+simpleInterest);

    }
}
