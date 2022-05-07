// Author: Nicolas Gonzalez
// Assignment: HW 2 Q5

import java.util.Scanner;

public class NicolasGonzalez_HW2_Q5 {
    public static void main(String args[]) {

        Scanner Input = new Scanner(System.in);

        // Takes in the first set of data
        System.out.print("Enter Circle1's center x-, y coordinates, and radius: ");

        double x1 = Input.nextDouble();
        double y1 = Input.nextDouble();
        double r1 = Input.nextDouble();

        // Takes in the second set of data
        System.out.print("Enter Circle2's center x-, y coordinates, and radius: ");

        double x2 = Input.nextDouble();
        double y2 = Input.nextDouble();
        double r2 = Input.nextDouble();

        // Determines if the circles overlap or are inside or do not overlap
        if (Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5) <= Math.abs(r1 - r2))
			System.out.println("circle2 is inside circle1");
		else if (Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5) <= r1 + r2)
			System.out.println("circle2 overlaps circle1");
		else
			System.out.println("circle2 does not overlap circle1");

        Input.close();
    }
    
}
