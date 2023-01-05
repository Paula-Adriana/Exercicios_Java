package br.com.udemy.employee;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.println("Enter the employee data: ");
		System.out.print("Name: ");
		employee.name = sc.next();
		
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println(employee);
		System.out.println();
		System.out.print("Which percentage to increase salary: ");
		employee.increaseSalary(sc.nextDouble());
		System.out.println();
		System.out.println("Updated data: " + employee);
		
		sc.close();
	}
}
