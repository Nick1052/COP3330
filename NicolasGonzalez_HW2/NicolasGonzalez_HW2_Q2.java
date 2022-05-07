// Author: Nicolas Gonzalez
// Assignment: HW 2 Q2

import java.util.Scanner;

public class NicolasGonzalez_HW2_Q2 {
    public static void main(String args[]) {

        Scanner Input = new Scanner(System.in);

		// Take in input.
        System.out.printf("Enter the first 9 digits of an ISBN as integer: ");
        int isbn = Input.nextInt();

		// Breaks down the number in order to use for later
        int d1 = isbn / 100000000;
		int leftover = isbn % 100000000;
		int d2 = leftover / 10000000;
		leftover %= 10000000;
		int d3 = leftover / 1000000;
		leftover %= 1000000;
		int d4 = leftover / 100000;
		leftover %= 100000;
		int d5 = leftover / 10000;
		leftover %= 10000;
		int d6 = leftover / 1000;
		leftover %= 1000;
		int d7 = leftover / 100;
		leftover %= 100;
		int d8 = leftover / 10;
		leftover %= 10;
		int d9 = leftover;

		// Calculates D10
		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

		//Prints out new ISBN
        if(d10 == 10)
            System.out.print("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
        else
            System.out.print("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);

        Input.close();
    }
}
