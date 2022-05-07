// Author: Nicolas Gonzalez
// Assignment: HW 1 -- Q3
// Purpose: Determine the acceleration using 3 variables

import java.util.Scanner;

public class NicolasGonzalez_HW1_Q3 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        // Take in inputs
        System.out.print("Enter v0, v1, and t: ");
        double v0 = Input.nextDouble();
        double v1 = Input.nextDouble();
        double t = Input.nextDouble();

        // Calculate acceleration
        double acceleration = (v1 - v0) / t;

        System.out.println("The average acceleration is " +  String.format("%.4f", acceleration));

        Input.close();
    }
}
