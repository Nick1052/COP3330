// Author: Nicolas Gonzalez
// Assignment: HW 1 -- Q5
// Purpose: Determine the wind chill index

import java.util.Scanner;

public class NicolasGonzalez_HW1_Q5 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        // Take in Inputs
        System.out.println("Enter the temperature in Fahrenheight between -58°F and 41°F:");
        double temp = Input.nextDouble();

        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double windspeed = Input.nextDouble();

        // Calculate Wind Chill Temp
        double WindChillTemp = 35.74 + .6215 * temp - 35.75 * Math.pow(windspeed, 0.16) + 0.4275 * temp * Math.pow(windspeed, 0.16);

        System.out.println("The wind chill index is " + String.format("%.5f", WindChillTemp));

        Input.close();
    }
}
