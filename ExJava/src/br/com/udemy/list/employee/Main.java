package br.com.udemy.list.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("How many employees will be registered? ");
		int numberOfEmployees = sc.nextInt();

		List<Employee> listOfEmployees = new ArrayList<>();

		for (int i = 0; i < numberOfEmployees; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			while(hasId(listOfEmployees, id)) {
				System.out.println("This id is already taken. Try again: ");
				id = sc.nextInt();
			}

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			listOfEmployees.add(new Employee(id, name, salary));

		}
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();

		Employee emp = listOfEmployees.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			emp.increaseSalary(sc.nextDouble());
		}

		System.out.println();
		System.out.println("List of employees: ");
		for (Employee employee : listOfEmployees) {
			System.out.println(employee);
		}

		sc.close();
	}

	private static boolean hasId(List<Employee> listOfEmployees, int id) {
		Employee emp = listOfEmployees.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
