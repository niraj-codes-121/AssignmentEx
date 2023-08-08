package com.takeo.week3.Day5;

import java.util.Scanner;

public class GivenADayOfWeek {
    //Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat,
    // and a boolean indicating if we are on vacation, return a string of the form "7:00"
    // indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00".
    // Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".
    //alarmClock(1, false) → "7:00"
    //alarmClock(5, false) → "7:00"
    //alarmClock(0, false) → "10:00"

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value from (0-6");
        int dayOfTheWeek = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Indicate if you are vacation or not (Yes/No) ");
        String vacationInput = scanner.nextLine();

        boolean vacation = vacationInput.equalsIgnoreCase("yes");

        String alarmTime = alarmClock(dayOfTheWeek, vacation);
        System.out.println("Alarm Time: " + alarmTime);
    }

    public static String alarmClock(int dayOfTheWeek, boolean vacation) {
        if (dayOfTheWeek == 0 || dayOfTheWeek == 6) {
            if (vacation) {
                return "off";
            } else {
                return "10:00";
            }
        } else {
            if (vacation) {
                return "10:00";
            } else {
                return "7:00";
            }
        }
    }
}