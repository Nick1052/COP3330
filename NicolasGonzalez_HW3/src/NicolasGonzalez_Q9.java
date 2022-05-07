// Author: Nicolas Gonzalez
// Assignment: HW 3 -- Q9
// Description: Determines if password is valid
// To be valid the password must be
// -> At least 8 characters
// -> Only digits or characters
// -> and contain at least 2 digits

import java.util.Scanner;

public class NicolasGonzalez_Q9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = input.nextLine();

        System.out.print(isPasswordValid(password)?"Valid Password":"Invalid Password");

        input.close();
    }
    public static boolean isPasswordValid(String password) {

        // Determines if password is valid
        return password.length() >= 8 && hasTwoDigits(password) && isOnlyLettersDigits(password);
    }
    public static boolean hasTwoDigits(String password) {

        int digits = 0;

        for(int i = 0; i < password.length(); i++) {
            if(Character.isDigit(password.charAt(i)))
                digits += 1;
        }

        return digits >= 2;
    }
    public static boolean isOnlyLettersDigits(String password) {

        for(int i = 0; i < password.length(); i++) {
            if(!(Character.isLetterOrDigit(password.charAt(i))))
                return false;
        }
        return true;
    }
}
