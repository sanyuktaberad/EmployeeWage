package com.bridgelabz;

import java.util.Scanner;

public class EmployeeWage {

	static int wagePerHour = 20;
	static int workingHoursPerDayParttimer = 4;
	static int workingHoursPerDayFulltimer = 8;
	static int workingDaysForAMonth = 20;

	static int wage = (int)(wagePerHour * workingHoursPerDayFulltimer * workingDaysForAMonth);
	static int wage2 = (int)(wagePerHour * workingHoursPerDayParttimer * workingDaysForAMonth);


	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");
		System.out.println("Enter 1 if the employee is present & fulltimer; enter 2 if the employee is present & parttimer; enter 0 if the employee is absent. ");

		Scanner scan = new Scanner(System.in); 
		int number = scan.nextInt();

		switch (number) {
		case 1 :
			System.out.println("Employee is Present & Fulltimer hence its monthly wage is : "+ wage +".");
			break;

		case 2 :  
			System.out.println("Employee is Present &  Parttimer hence its monthly wage is : "+ wage2 +".");
			break;

		default:
			System.out.println("Employee is Absent & its daily wage is 0.");
		}
		return;
	}
}
