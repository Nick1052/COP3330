// Author: Nicolas Gonzalez
// Assignment: HW 2 Q7

import java.util.Scanner;

public class NicolasGonzalez_HW2_Q7 {
    public static void main(String args[]) {
        
        Scanner Input = new Scanner(System.in);

        // Takes in input
        System.out.print("Enter an ASCII code: ");
        int ascii = Input.nextInt();

        //Prints out the in character in ASCII
        System.out.printf("The character for ASCII code %d is %c", ascii, ascii);

        Input.close();
    }
}
