package com.bridgelabz;

import java.util.Scanner;

public class EmployeeWage {

	static int wagePerHour = 20;
	


	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");
		System.out.println("Enter 1 if the employee is present & fulltimer; enter 2 if the employee is present & parttimer; enter 0 if the employee is absent. ");

		Scanner scan = new Scanner(System.in); 
		int number = scan.nextInt();
		
		
		System.out.println("Enter the value of working days of a month:");
		Scanner a = new Scanner(System.in); 
		int value = a.nextInt();
		int workingDaysForAMonth = value;
		
		System.out.println("Enter the value of Working hours of a month:");
		Scanner a1 = new Scanner(System.in); 
		int value1 = a1.nextInt();
		int workingHoursPerDayParttimer = value1;
		int workingHoursPerDayFulltimer = value1;
		
		
		int wage = (int)(wagePerHour * workingHoursPerDayFulltimer * workingDaysForAMonth);
		int wage2 = (int)(wagePerHour * workingHoursPerDayParttimer * workingDaysForAMonth);

		
		
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
	}
}
