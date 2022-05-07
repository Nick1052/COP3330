// Author: Nicolas Gonzalez
// Assignment: HW 3 -- Q2
// Description: Determines the interested rates and total payment on a loan depending on number of years

import java.util.Scanner;

public class NicolasGonzalez_Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loan = input.nextDouble();

        System.out.print("Number of Years: ");
        double years = input.nextDouble();

        System.out.println("Interest Rate    Monthly Payment    Total Payment");

        // Determines the loan and monthly payment and total payment.
        for (double i = 5.0; i <= 8; i += 0.125) {

            System.out.printf("%-5.3f", i);
            System.out.print("%           ");

            double monthlyInterest = i / 1200;
            double monthlyPayment = loan * monthlyInterest / (1 - 1 / Math.pow(1 + monthlyInterest, years * 12));

            System.out.printf("%-19.2f", monthlyPayment);
            System.out.printf("%-8.2f\n",(monthlyPayment * 12) * years);
        }

        input.close();
    }
}
