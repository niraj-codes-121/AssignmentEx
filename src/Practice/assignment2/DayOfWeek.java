package Practice.assignment2;
//Exercise 3: Day of the Week
//Write a Java program that takes a number representing a day of the week (1 for Sunday, 2 for Monday, etc.)
// and displays the corresponding day's name.
//Instructions:
//Use the Scanner class to take input from the user for the number representing the day of the week.
//Implement a switch statement to display the corresponding day's name.
//Display the day's name to the user.
//Ex : Enter a number (1-7) representing the day of the week: 3
//     Day of the week: Tuesday
import java.util.Scanner;

public class DayOfWeek {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read input from the user

            System.out.print("Enter a number (1-7) representing the day of the week: ");
            int dayNumber = scanner.nextInt();

            scanner.close();  // Close the Scanner
            String dayName;   // Use a switch statement to display the day's name
            switch (dayNumber) {
                case 1:
                    dayName = "Sunday";
                    break;
                case 2:
                    dayName = "Monday";
                    break;
                case 3:
                    dayName = "Tuesday";
                    break;
                case 4:
                    dayName = "Wednesday";
                    break;
                case 5:
                    dayName = "Thursday";
                    break;
                case 6:
                    dayName = "Friday";
                    break;
                case 7:
                    dayName = "Saturday";
                    break;
                default:
                    dayName = "Invalid day number. Please enter a number between 1 and 7.";
            }

            System.out.println("Day of the week: " + dayName);

    }
}
