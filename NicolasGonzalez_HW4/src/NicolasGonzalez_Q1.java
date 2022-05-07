// Author: Nicolas Gonzalez
// Assignment: NicolasGonzalez_Q1
// Description: get the avg of scores above and below

import java.util.Scanner;

public class NicolasGonzalez_Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter scores (Up to 100 -- Negative number stops the scores): ");

        int[] scores = new int[100];

        // int i will help gather the numbers and keep track of the number added
        int num;
        int i = 0;
        int avg = 0;

        for(; i < 100; i++) {
            num = input.nextInt();

            if(num < 0)
                break;

            scores[i] = num;
            avg += num;
        }

        // Calculates the avg
        avg /= i;

        int aboveAvg = 0;
        int belowAvg = 0;

        // Determines scores above or equal to the avg and below the avg
        for(int j = 0; j < i; j++) {
            if(scores[j] >= avg)
                aboveAvg++;
            else
                belowAvg++;
        }

        System.out.println("The Avg scores is: " + avg);
        System.out.println("The number of scores above or equal to the Avg is: " + aboveAvg);
        System.out.println("The number of scores below the Avg is: " + belowAvg);

        input.close();
    }

}
