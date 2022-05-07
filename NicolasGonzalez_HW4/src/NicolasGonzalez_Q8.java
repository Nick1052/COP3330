// Author: Nicolas Gonzalez
// Assignment: NicolasGonzalez_Q8
// Description: Connect four game

import java.util.Scanner;

public class NicolasGonzalez_Q8 {

    // Public class variables available across all functions
    boolean winner = false;
    static boolean redTurn = true;

    public static <bool> void main(String[] args) { //15 6

        char[][] connectFour = new char[6][15];

        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < 6; j++) {
                if(i % 2 == 0)
                    connectFour[j][i] = '|';
                else
                    connectFour[j][i] = ' ';
            }
        }

        for(int i = 0, j = 0; i < 6;) {
            if(j < 15) {
                System.out.print(connectFour[i][j]);
                j++;
            }
            else {
                System.out.println();
                j = 0;
                i++;
            }
        }
        System.out.println("---------------");
        System.out.println("Drop a "+ ((redTurn)?"Red":"Yellow") + " disk at column (0-6): ");

        boolean winner = false;

        //Unsure how to do winning condition diagonally
        //while(!(winner)) {
        //    boolean turn =
        //}

    }
}
