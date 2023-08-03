package com.takeo.week1.day2;
//Write a program that converts Celsisus to Fahrenheit using the formula (Celsius * 9/5) + 32, and
// prints the converted temperature.
//// use proper data type for this as we can have decimal value there.

public class TemperatureConversion {

    public static void main(String[] args) {

        //datatype double(storing fractional no. for 15 decimal digit), variable celsius
        double Celsius;

        //double datatype, variable fahrenheit
        double Fahrenheit;

        Celsius=43;  // let assume the temperature in Celsius is 43
        Fahrenheit=(Celsius * 9/5) + 32;  // formula for converting C to F

         System.out.println("The temperature in Fahrenheit is:" + Fahrenheit); //The temperature in Fahrenheit is:109.4

    }
}
