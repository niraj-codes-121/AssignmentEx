package com.takeo.Week4.Day2;
//Create a simple phonebook using a map to store names and phone numbers. Allow the user to add, search for, and remove entries.Create a simple phonebook using a map to store names and phone numbers.
// Allow the user to add, search for, and remove entries.



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

    public class Phonebook {
        public static void main(String[] args) {
            Map<String, String> phonebook = new HashMap<>();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Phonebook Menu:");
                System.out.println("1. Add Entry");
                System.out.println("2. Search Entry");
                System.out.println("3. Remove Entry");
                System.out.println("4. Quit");
                System.out.print("Choose an option: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter phone number: ");
                        String phoneNumber = scanner.nextLine();
                        phonebook.put(name, phoneNumber);
                        System.out.println("Entry added.");
                        break;

                    case 2:
                        System.out.print("Enter name to search: ");
                        String searchName = scanner.nextLine();
                        if (phonebook.containsKey(searchName)) {
                            System.out.println("Phone number: " + phonebook.get(searchName));
                        } else {
                            System.out.println("Entry not found.");
                        }
                        break;

                    case 3:
                        System.out.print("Enter name to remove: ");
                        String removeName = scanner.nextLine();
                        if (phonebook.containsKey(removeName)) {
                            phonebook.remove(removeName);
                            System.out.println("Entry removed.");
                        } else {
                            System.out.println("Entry not found.");
                        }
                        break;

                    case 4:
                        System.out.println("Exiting Phonebook.");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid option.");
                        break;
                }
            }
        }
    }
