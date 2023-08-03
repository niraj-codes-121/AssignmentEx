package Practice.ArrayExample;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        {
            int[] a = new int[10];
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                Scanner input = new Scanner(System.in);
                System.out.printf("Element of a[%d] :", i);
                a[i] = input.nextInt();
            }

            for (int i : a)
                sum += i;
            System.out.println("Sum Values of Array : " + sum);
        }
    }
}
