// Author: Nicolas Gonzalez
// Assignment: HW 2 Q9

import java.util.Scanner;

public class NicolasGonzalez_HW2_Q9 {
    public static void main(String args[]) {
        
        Scanner Input = new Scanner(System.in);

        System.out.print("Enter a SSN: ");
        String ssn = Input.nextLine();

		// Determines if the string is valid in the format we want it
        boolean isValid = 
			(ssn.length() == 11) && 
			(Character.isDigit(ssn.charAt(0))) &&
			(Character.isDigit(ssn.charAt(1))) &&
			(Character.isDigit(ssn.charAt(2))) &&
			(ssn.charAt(3) == '-') &&
			(Character.isDigit(ssn.charAt(4))) &&
			(Character.isDigit(ssn.charAt(5))) &&
			(Character.isDigit(ssn.charAt(7))) &&
			(ssn.charAt(6) == '-') &&
			(Character.isDigit(ssn.charAt(8))) &&
			(Character.isDigit(ssn.charAt(9))) &&
			(Character.isDigit(ssn.charAt(10)));

		// Displays data
        System.out.println(ssn + " is " + ((isValid) ? "a valid " : "an invalid ")+ "social security number");

        Input.close();

    }
}
