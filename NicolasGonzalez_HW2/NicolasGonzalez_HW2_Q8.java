// Author: Nicolas Gonzalez
// Assignment: HW 2 Q8

import java.util.Scanner;

public class NicolasGonzalez_HW2_Q8 {
    public static void main(String args[]) {
        
        Scanner Input = new Scanner(System.in);

        // Takes the input
        System.out.print("Enter a letter grade: ");
        char grade = Input.next().charAt(0);

        // Deterines the numeric value based on the input
        switch(grade) {

            case 'A':
                System.out.print("The numeric value for grade A is 4");
                break;
            case 'B':
                System.out.print("The numeric value for grade A is 3");
                break;
            case 'C':
                System.out.print("The numeric value for grade A is 2");
                break;
            case 'D':
                System.out.print("The numeric value for grade A is 1");
                break;
            case 'F':
                System.out.print("The numeric value for grade A is 0");
                break;
            default:
                System.out.printf("%c is an invalid grade", grade);
        }

        Input.close();
    }   
}
