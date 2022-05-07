// Author: Nicolas Gonzalez
// Assignment: HW 3 -- Q7
// Description: Demonstrates the celsius to fahrenheit and vise versa

public class NicolasGonzalez_Q7 {
    public static void main(String[] args) {

        System.out.println("Celsius     Fahrenheit");
        System.out.println("----------------------");

        // Prints celsius to Fahrenheit values from 40 to 31
        for(double i = 40.0; i >= 31.0; i--)
            System.out.printf("%.1f        %.2f\n",i ,celsiusToFahrenheit(i));


        System.out.println("\n\nFahrenheit     Celsius");
        System.out.println("----------------------");

        // Prints fahrenheit to celsius values from 120 to 30
        for(double i = 120.0; i >= 30.0; i -= 10)
            System.out.printf("%.1f        %.2f\n",i ,fahrenheitToCelsius(i));


    }
    public static double celsiusToFahrenheit(double celsius) {

        double fahrenheit = (9.0 / 5) * celsius + 32;

        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {

        double celsius = (5.0 / 9) * (fahrenheit - 32);

        return celsius;

    }
}
