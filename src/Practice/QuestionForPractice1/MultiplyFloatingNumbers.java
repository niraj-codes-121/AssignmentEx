package Practice.QuestionForPractice1;
//Write a program to multiply two floating-point numbers.
import java.util.Scanner;

public class MultiplyFloatingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first float number:");
        float num1 = sc.nextFloat();
        System.out.println("'Enter Second float number:");
        float num2= sc.nextFloat();
        float num =num1*num2;
        System.out.println("Multiple of floating two number is:"+num);
        sc.close();
    }
}
