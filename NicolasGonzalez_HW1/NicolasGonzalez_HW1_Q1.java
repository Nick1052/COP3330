// Author: Nicolas Gonzalez
// Assignment: HW 1 -- Q1
// Purpose: Converted feet to meters

import java.util.Scanner;

public class NicolasGonzalez_HW1_Q1 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        final double CONVERSION = .305;

        // Take in Inputs
        System.out.print("Enter a value for feet: ");
        double feet = Input.nextDouble();

        // Calculate converted to meters
        double converted = feet * CONVERSION;

        System.out.println("\n" + feet + " feet is " + String.format("%.4f", converted) + " meters");

        Input.close();
    }

}