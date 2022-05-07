// Author: Nicolas Gonzalez
// Assignment: HW 3 -- Q1
// Description: Use nested loop to print a number pyramid

public class NicolasGonzalez_Q1 {
    public static void main(String[] args) {

        // Nested loop that prints the pyramid
        for(int i = 1; i <= 8; i++) {

                for(int j = 1; j <= 8 - i; j++)
                    System.out.print("    ");

                for(int j = 1; j <= (int)Math.pow(2, i - 1); j *= 2)
                    System.out.printf("%3d ", j);

                for(int j = (int)Math.pow(2,  i - 2); j >= 1; j /= 2)
                    System.out.printf("%3d ", j);

                System.out.println("");
            }
    }
}
