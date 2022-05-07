// Author: Nicolas Gonzalez
// Assignment: HW 2 Q10

import java.util.Scanner;

public class NicolasGonzalez_HW2_Q10 {
    public static void main(String args[]) {

        Scanner Input = new Scanner(System.in);

		// Take in inputs
		System.out.print("Enter employee’s name: ");
		String name = Input.next();	
		System.out.print("Enter number of hours worked in a week: ");
		double hoursWorked = Input.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double hourlyPayRate = Input.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double federalTaxRate = Input.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		double stateTaxRate = Input.nextDouble();

		// Display data and caluculations
        double grossPay, federal, state, totalDeduction;
		System.out.println("\n\nEmployee Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Pay Rate: $" + hourlyPayRate);
		System.out.println("Gross Pay: $" + (grossPay = hoursWorked * hourlyPayRate));
        System.out.println("Deductions:");
        System.out.println("\tFederal Witholding (20.0%): $" + (federal = grossPay * federalTaxRate));
        System.out.println("\tState Witholding (9.0%): $" + (state = grossPay * stateTaxRate));
        System.out.println("\tTotal Deduction: $" + (totalDeduction = federal + state));
        System.out.println("\tTotal Deduction: $" + (totalDeduction = federal + state));
		System.out.println("Net Pay: $"+ (grossPay - totalDeduction));
			

        Input.close();
    }
}
