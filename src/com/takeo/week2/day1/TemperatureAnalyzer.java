package com.takeo.week2.day1;
//Exercise 3: TemperatureAnalyzer
//Create a Java program that takes an array of temperature values as input and performs some
// basic analysis on the data.
//Here are the steps to follow:
//Create a class named TemperatureAnalyzer.
//Declare a static method named findMaxTemperature that takes an integer array (temperatures) as
// an argument and returns the maximum temperature value in the array.
//Declare a static method named findMinTemperature that takes the same integer array
// (temperatures) as an argument and returns the minimum temperature value in the array.
//Declare a static method named findAverageTemperature that takes the same integer array (temperatures)
// as an argument and returns the average temperature value as a double.
//In the main method, create an integer array with some sample temperature values.
//Call the findMaxTemperature, findMinTemperature, and findAverageTemperature methods,
// passing the array as an argument.
//Print the maximum, minimum, and average temperatures
public class TemperatureAnalyzer {
    public static void main(String[] args) {
        // Sample temperature values
        int[] temperatures = {25, 30, 28, 22, 35, 27};

        // Call the methods and print the results
        int maxTemperature = findMaxTemperature(temperatures);
        int minTemperature = findMinTemperature(temperatures);
        double averageTemperature = findAverageTemperature(temperatures);

        System.out.println("Maximum Temperature: " + maxTemperature);
        System.out.println("Minimum Temperature: " + minTemperature);
        System.out.println("Average Temperature: " + averageTemperature);
    }

    public static int findMaxTemperature(int[] temperatures) {
        int maxTemp = temperatures[0]; // Initialize maxTemp to the first element
        for (int temp : temperatures) {
            if (temp > maxTemp) {
                maxTemp = temp;
            }
        }
        return maxTemp;
    }

    public static int findMinTemperature(int[] temperatures) {
        int minTemp = temperatures[0]; // Initialize minTemp to the first element
        for (int temp : temperatures) {
            if (temp < minTemp) {
                minTemp = temp;
            }
        }
        return minTemp;
    }

    public static double findAverageTemperature(int[] temperatures) {
        int sum = 0;
        for (int temp : temperatures) {
            sum += temp;
        }
        return (double) sum / temperatures.length;
    }
}