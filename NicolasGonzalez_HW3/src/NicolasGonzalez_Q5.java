// Author: Nicolas Gonzalez
// Assignment: HW 3 -- Q5
// Description: Prints out a string made from another string using only odd character indexes

import java.util.Scanner;

public class NicolasGonzalez_Q5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String line = input.nextLine();

        // Empty string to concatenate into
        String odd = "";

        int length = line.length();

        // Concatenation into the empty string
        for(int i = 0; i < length; i += 2) {
            odd += line.charAt(i);
        }

        System.out.printf("%s", odd);

        input.close();
    }
}
