// Author: Nicolas Gonzalez
// Assignment: HW 1 -- Q4
// Purpose: Determine the monthly compount saving total

import java.util.Scanner;

public class NicolasGonzalez_HW1_Q4 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        final double MONTHLY_INTEREST_RATE = 0.00417;

        // Take in inputs
        System.out.print("Enter the monthly saving amount: ");
        double saving = Input.nextDouble();

        // Determine the first total before adding it to itself (1st month)
        double total = saving * (1 + MONTHLY_INTEREST_RATE);

        // Do the compound interest for the next 5 months (Could have been done in a loop)
		total = (saving + total) * (1 + MONTHLY_INTEREST_RATE);
		total = (saving + total) * (1 + MONTHLY_INTEREST_RATE);
		total = (saving + total) * (1 + MONTHLY_INTEREST_RATE);
		total = (saving + total) * (1 + MONTHLY_INTEREST_RATE);
		total = (saving + total) * (1 + MONTHLY_INTEREST_RATE);
        
        System.out.println("After the sixth month, the account value is $" + String.format("%.2f", total));

        Input.close();
    }
}
