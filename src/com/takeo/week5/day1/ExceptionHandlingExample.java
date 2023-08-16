package com.takeo.week5.day1;
//we can use try catch
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        try {
            System.out.println(a[5]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e.getMessage());
        }

        System.out.println("Next set of Action");
    }
}
