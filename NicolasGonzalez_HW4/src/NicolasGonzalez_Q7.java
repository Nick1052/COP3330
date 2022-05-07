// Author: Nicolas Gonzalez
// Assignment: NicolasGonzalez_Q7
// Description: Determine the maximum square submatrix

import java.util.Scanner;

public class NicolasGonzalez_Q7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        int size = input.nextInt();

        System.out.println("Enter the matrix row by row: ");
        int[][] m = new int[size][size];

        for(int i = 0, j = 0; i < size;) {
            if(j < size) {
                m[i][j] = input.nextInt();
                j++;
            }
            else {
                j = 0;
                i++;
            }
        }

        int[] location = findLargestBlock(m);

        if (location != null) {
            System.out.printf("The maximum square submatrix is at (%d, %d) with size %d",
                    location[0], location[1], location[2]);
        }


    }
    public static int[] findLargestBlock(int[][] m) {

        int[] highestSquare = null;
        int highestSize = 0;
        int length = m.length;

        for (int i = 0; i <length; i++) {

            for (int j = 0; j < length; j++) {

                int occurrence = getOccurrence(m, i, j);

                // Continue to look for more
                if (occurrence < 2)
                    continue;
                if (scanPossibleSquare(m, i, j, occurrence) && occurrence > highestSize) {

                    highestSize = occurrence;
                    highestSquare = new int[]{i,j,occurrence};
                }
            }
        }
        return highestSquare;
    }

    public static int getOccurrence(int[][] m, int row, int column) {

        int occurrence = 0;
        int length = m[0].length;


        if (column == length - 1)
            return 0;

        // Find the occurences or return 0
        for (int j = column; j < length; j++) {
            if (m[row][j] == 1) {
                occurrence++;
                if (j == length - 1)
                    return occurrence;
            } else if (occurrence > 1)
                return occurrence;
            else
                return 0;
        }
        return 0;
    }

    public static boolean scanPossibleSquare(int[][] m, int row, int column, int occurrence) {

        int length = m.length;

        // Check conditions for false squares
        if (row + occurrence > length)
            return false;

        // Check conditions for false squares
        for (int i = row; i < occurrence + row; i++) {
            for (int j = column; j < occurrence + column; j++) {
                if (m[i][j] == 0)
                    return false;
            }
        }
        // If all else its true
        return true;
    }

}
