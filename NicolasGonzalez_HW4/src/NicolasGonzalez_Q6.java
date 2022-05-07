// Author: Nicolas Gonzalez
// Assignment: NicolasGonzalez_Q6
// Description: Determine is matrix is markov matrix

import java.util.Scanner;

public class NicolasGonzalez_Q6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 3-by-3 matrix row by row: ");
        double[][] m = new double[3][3];

        for(int i = 0, j = 0; i < 3;) {
            if(j < 3) {
                m[i][j] = input.nextDouble();
                j++;
            }
            else {
                j = 0;
                i++;
            }
        }

        if(isMarkovMatrix(m))
            System.out.print("It is a Markov matrix");
        else
            System.out.print("It is not a Markov matrix");

    }
    public static boolean isMarkovMatrix(double[][] m){

        for(int i = 0; i < 3; i++)
            if(m[0][i] + m[1][i] + m[2][i] != 1)
                return false;

        return true;
    }
}
