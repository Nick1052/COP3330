// Author: Nicolas Gonzalez
// Assignment: NicolasGonzalez_Q5
// Description: Determines if an array is strictly identical or not

import java.util.Arrays;
import java.util.Scanner;

public class NicolasGonzalez_Q5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int size = input.nextInt();
        int[] list1 = new int[size];

        for(int i = 0; i < size; i++)
            list1[i] = input.nextInt();

        System.out.print("Enter list2: ");
        size = input.nextInt();
        int[] list2 = new int[size];

        for(int i = 0; i < size; i++)
            list2[i] = input.nextInt();

        if(list1.length != list2.length)
            System.out.print("Two list are not strictly identical");
        else if(equals(list1, list2))
            System.out.print("Two list are strictly identical");
        else
            System.out.print("Two list are not strictly identical");


    }
    public static boolean equals(int[] list1, int[] list2) {

        // Could be done also by using a for loop and checking when the list values are not the same at an ith index
        return Arrays.equals(list1, list2);

    }
}
