// Author: Nicolas Gonzalez
// Assignment: HW 2 Q4

import java.util.Scanner;

public class NicolasGonzalez_HW2_Q4 {
    public static void main(String args[]) {

        // Ramdonly chooses number between 0 - 2
        Scanner Input = new Scanner(System.in);
        int comp = (int)(Math.random() * 3);

        // Takes in input
        System.out.print("scissor (0), rock (1), paper (2): ");
		int choice = Input.nextInt();

        // Prints out what the compute choose
		switch (comp) {
			case 0: 
                    System.out.print("The computer is scissor. "); 
                    break;
			case 1: 
                    System.out.print("The computer is rock. "); 
                    break;
			case 2: 
                    System.out.print("The computer is paper. ");
		}

        // Prints what the user is
		switch (choice) {
			case 0: 
                    System.out.print("You are scissor"); 
                    break;

			case 1: 
                    System.out.print("You are rock"); 
                    break;
			case 2: 
                    System.out.print("You are paper");
		}

        // Determines who wins
        if (comp == choice)
			System.out.println(" too. It is a draw");
		else {
			if ((choice == 0 && comp == 2) ||
                (choice == 1 && comp == 0) || 
                (choice == 2 && comp == 1))

				System.out.println(". You won");
			else
				System.out.println(". You lose");
		}
        
        Input.close();
    }
}
