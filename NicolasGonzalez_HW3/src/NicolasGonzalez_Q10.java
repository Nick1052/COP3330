// Author: Nicolas Gonzalez
// Assignment: HW 3 -- Q10
// Description: Convert a string to ints using a phone system

import java.util.Scanner;

public class NicolasGonzalez_Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String line = input.nextLine();

        // Prints out the string in integer format
        for(int i = 0; i < line.length(); i++) {
            if(Character.isLetter(line.charAt(i)))
                System.out.print(getNumber(Character.toUpperCase(line.charAt(i))));
            else
                System.out.print(line.charAt(i));

        }
        input.close();
    }

    public static int getNumber(char uppercaseLetter) {

        // Use an advance switch to return
        return switch (uppercaseLetter) {
            case 'A', 'B', 'C' -> 2;
            case 'D', 'E', 'F' -> 3;
            case 'G', 'H', 'I' -> 4;
            case 'J', 'K', 'L' -> 5;
            case 'M', 'N', 'O' -> 6;
            case 'P', 'Q', 'R', 'S' -> 7;
            case 'T', 'U', 'V' -> 8;
            case 'W', 'X', 'Y', 'Z' -> 9;
            default -> -444;
        };

    }

}
