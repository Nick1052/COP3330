// Author: Nicolas Gonzalez
// Assignment: HW 2 Q3

import java.util.Scanner;

public class NicolasGonzalez_HW2_Q3 {
    public static void main(String args[]) {

        Scanner Input = new Scanner(System.in);

        // Generates a random number between 0 - 999 and converts to int
        int lottery = (int) (Math.random() * 1000);

        System.out.print("Enter your lottery pick (three digits): ");
        int guess = Input.nextInt();

        // Isolates the digits of the random number and guess number
        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = (lottery % 100) / 10;
        int lotteryDigit3 = lottery % 10;
        int guessDigit1 = guess / 100;
        int guessDigit2 = (guess % 100) / 10;
        int guessDigit3 = guess % 10;

        // Prints out the lottery number
        System.out.println("The lottery number is " + lotteryDigit1 + lotteryDigit2 + lotteryDigit3);
 
        // Determines what kind of price was won based on the input.
        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        else if ((guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit3)
                || (guessDigit1 == lotteryDigit2
                && guessDigit1 == lotteryDigit3 && guessDigit3 == lotteryDigit1)
                || (guessDigit1 == lotteryDigit3
                && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2)
                || (guessDigit1 == lotteryDigit3
                && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1)
                || (guessDigit1 == lotteryDigit1
                && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2))

                System.out.println("Match all digits: you win $3,000");
        else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2
                || guessDigit1 == lotteryDigit3 || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3
                || guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2
                || guessDigit3 == lotteryDigit3)

                System.out.println("Match one digit: you win $1,000");
        else
                System.out.println("Sorry, no match");

        
        Input.close();

    }
    
}
