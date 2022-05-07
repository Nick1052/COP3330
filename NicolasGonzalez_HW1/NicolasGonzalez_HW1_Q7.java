// Author: Nicolas Gonzalez
// Assignment: HW 1 -- Q7
// Purpose: Determine the area of a triangle

import java.util.Scanner;

public class NicolasGonzalez_HW1_Q7 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        // Take inputs
        System.out.println("Enter the coordinates of three points seperated by spaces");
        System.out.print("like x1 y1 x2 y2 x3 y3: ");

        double x1 = Input.nextDouble();
        double y1 = Input.nextDouble();

        double x2 = Input.nextDouble();
        double y2 = Input.nextDouble();

        double x3 = Input.nextDouble();
        double y3 = Input.nextDouble();

        // Determine each side of the triangle
        double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);

        // Calculate the area
		double s = (side1 + side2 + side3) / 2;
		double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

        System.out.println("The area of the triangle is " + String.format("%.1f", area));

        Input.close();
    }
}
