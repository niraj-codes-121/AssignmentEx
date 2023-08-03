package Practice.MixedEx;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        //create a Scanner object to read the use input from the console
        Scanner scanner = new Scanner(System.in);

        //prompt the user to enter name
        System.out.println("Enter you name:");

        //use the scanner object to read the input from the user
        String name= scanner.nextLine();

        System.out.println("Enter you age :");
        String age=scanner.nextLine();

    }
}
