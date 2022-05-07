// Author: Nicolas Gonzalez
// Assignment: HW 3 -- Q8
// Description: Prints the number of days between year 2000 to 2020

public class NicolasGonzalez_Q8 {
    public static void main(String[] args) {

        System.out.println("Year     Days in year");

        for(int i = 2000; i <= 2020; i++) {
            System.out.println(i+"     "+numberOfDaysInAYear(i));
        }

    }
    public static int numberOfDaysInAYear(int year) {

        //Adds an extra day if it's a leap year
        if(year % 4 == 0)
            return 366;
        else
            return 365;

    }
}
