// Author: Nicolas Gonzalez
// Assignment: HW 3 -- Q6
// Description: Takes in an integer and returns the sum of the digits

import java.util.Scanner;

public class NicolasGonzalez_Q6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a some digits: ");
        int digits = input.nextInt();

        System.out.print("The sum is " + sumDigits(digits));

        input.close();

    }
    public static int sumDigits(long n) {

        int sum = 0;

        // This loop determines the sum of the digits
        while(n > 0) {

            sum += (int)n % 10;
            n = (int)n / 10;

        }
        return sum;
    }
}
