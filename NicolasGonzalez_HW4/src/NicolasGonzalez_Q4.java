// Author: Nicolas Gonzalez
// Assignment: NicolasGonzalez_Q4
// Description: Beanmachine game with end results

import java.util.Arrays;
import java.util.Scanner;

public class NicolasGonzalez_Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of balls to drop: ");
        int numBalls = input.nextInt();

        System.out.print("Enter the number of slots in the bean machine: ");
        int numSlots = input.nextInt();
        System.out.println();

        beanMachineGame(numBalls, numSlots);
    }
    public static void beanMachineGame(int numBalls, int numSlots) {

        int[][] beanSlot = new int[numBalls][numSlots];
        String path = "";

        for(int i = 0; i < numBalls; i++)
            Arrays.fill(beanSlot[i], 1);

        for(int j = 0; j < numBalls; j++) {

            int column = numSlots / 2;
            int row = numBalls - 1;

            for (int i = 0; i < numSlots - 1; i++) {
                if ((int) (Math.random() * 50) + 1 >= 25) {
                    path += "L";

                    if(column > 0)
                        column--;
                }
                else {
                    path += "R";

                    if(column < numSlots - 2)
                        column++;
                }
            }
            System.out.println(path);
            while(beanSlot[row][column] == 0 && row > 0)
                row--;

            beanSlot[row][column] = 0;
            path = "";
        }

        for(int i = 0, j = 0; i < numBalls;) {
            if(j < numSlots) {
                if(beanSlot[i][j] == 0)
                    System.out.print(beanSlot[i][j]);
                else
                    System.out.print(" ");
                    j++;
            }
            else {
                System.out.println();
                j = 0;
                i++;
            }
        }

    }
}
