// Author: Nicolas Gonzalez
// Assignment: HW 2 Q1

import java.util.Scanner;

public class NicolasGonzalez_HW2_Q1 {
    public static void main(String args[]) {

        Scanner Input = new Scanner(System.in);

        // Takes in digits
        System.out.print("Enter a, b, c, d, e, f: ");

        double a = Input.nextDouble();
        double b = Input.nextDouble();
        double c = Input.nextDouble();
        double d = Input.nextDouble();
        double e = Input.nextDouble();
        double f = Input.nextDouble();

        // Determines if valid and prints out accordingly
        if((a * d - b * c) == 0) {

            System.out.println("The equation has no solution.");
        
        }
        else {

            double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
            double y = ((a * f) - (e * c)) / ((a * d) - (b * c));

            System.out.printf("x is %.1f and y is %.1f", x, y);

        }

        Input.close();
    }
}