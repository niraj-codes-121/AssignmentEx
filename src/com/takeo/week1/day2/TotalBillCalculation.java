package takeo.day2;

//Exercise 3: Total Bill Calculation
//Scenario: You are developing a restaurant bill calculation application. You need to implement a feature
// that calculates the total bill amount, including tax and tip.
//Given : Bill amount = 30, Taxes = 15, Tip  = 10
//Task: Write a program that calculates the total bill amount by adding the bill amount, tax and tip.

public class TotalBillCalculation {

    public static void main(String[] args) {

        float Bill_Amount = 30;   //datatype float,  variable Bill_Amount and given value
               float Taxes = 15;  //datatype float, variable taxes and given value
               float Tip  = 10;  //datatype float, variable Tip and given value
               float Total_Bill;

               Total_Bill= (Bill_Amount + Taxes + Tip); //calculation A.T.Q given

               System.out.println("The Total Bill is:" +Total_Bill); //The Total Bill is:55.0


    }
}
