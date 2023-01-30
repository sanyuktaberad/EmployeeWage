package com.bridgelabz;

public class EmployeeWage {
	
	static int wagePerHour = 20;
	static int workingHoursPerDay = 8;
	static int wage = (int)(wagePerHour * workingHoursPerDay);
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		double number = Math.floor(Math.random() * 10) % 2;
		if (number == 1) {
			System.out.println("Employee is Present & its daily wage is : "+ wage +".");
		} else {
			System.out.println("Employee is Absent & its daily wage is 0.");
		}
	}
}
