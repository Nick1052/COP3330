// Author: Nicolas Gonzalez
// Assignment: HW 1 -- Q2
// Purpose: Determine the sum of numbers in an int

import java.util.Scanner;

public class NicolasGonzalez_HW1_Q2 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        int sum = 0;

        // Take in inputs
        System.out.print("Enter a number between 0 and 1000: ");
        int num = Input.nextInt();

        // While loop to determine the sum
        while(num > 0) {
            sum += (num % 10);
            num /= 10;
        }

        System.out.println("The sum of the digits is " + sum);

        Input.close();
    }
}
