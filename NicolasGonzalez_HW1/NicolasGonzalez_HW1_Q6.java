// Author: Nicolas Gonzalez
// Assignment: HW 1 -- Q6
// Purpose: Calculate the future invesment value

import java.util.Scanner;

public class NicolasGonzalez_HW1_Q6 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        // Take in Inputs
        System.out.print("Enter invesment amount: ");
        double Invesment = Input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double Interest = Input.nextDouble();

        System.out.print("Enter number of years: ");
        double Years = Input.nextDouble();

        // Calculate future investment
        // Interest is divided by 12 and 100 (1200) to calculate montly interest
        double futureInvestment = Invesment * Math.pow((1 + Interest / 1200), Years * 12);

        System.out.print("Future value is $" + String.format("%.2f", futureInvestment));

        Input.close();
    }
}
