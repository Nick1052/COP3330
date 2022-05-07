// Author: Nicolas Gonzalez
// Assignment: HW 3 -- Q3
// Description: Calculate and prints out the value of pi using a given formula using i = 10000, 20000, 100000

public class NicolasGonzalez_Q3 {
    public static void main(String[] args) {

        double inside = 0;

        //Prints out the pi value for i = 10000
        for(int i = 1; i <= 10000; i++)
            inside += (Math.pow(-1,i + 1)) / (2 * i - 1);

        System.out.printf("P value for 10000: %f\n", 4 * inside );

        //Prints out the pi value for i = 20000
        for(int i = 10001; i <= 20000; i++)
            inside += (Math.pow(-1,i + 1)) / (2 * i - 1);

        System.out.printf("P value for 20000: %f\n", 4 * inside );

        //Prints out the pi value for i = 100000
        for(int i = 20001; i <= 100000; i++)
            inside += (Math.pow(-1,i + 1)) / (2 * i - 1);

        System.out.printf("P value for 100000: %f\n", 4 * inside );

    }
}
