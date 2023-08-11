package Practice.QuestionForPractice1;
//Write a program to convert String to int.
// Hint Integer.parseInt()
import java.util.Scanner;

public class StringToIntConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer as a string: ");
        String input = scanner.nextLine();

        try {
            int convertedInt = Integer.parseInt(input);
            System.out.println("Converted integer: " + convertedInt);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        scanner.close();
    }
}