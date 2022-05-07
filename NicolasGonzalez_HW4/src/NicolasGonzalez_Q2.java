import java.util.Arrays;
// Author: Nicolas Gonzalez
// Assignment: NicolasGonzalez_Q2
// Description: Find the minimum number in an array

import java.util.Scanner;

public class NicolasGonzalez_Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 numbers: ");
        double[] nums = new double[10];

        for(int i = 0; i < 10; i++)
            nums[i] = input.nextDouble();

        System.out.print("The minimum number is: "+ min(nums));

    }
    public static double min(double[] array) {

        // Alternatively, one could go through each value and look for the min
        Arrays.sort(array);

        return array[0];
    }
}
