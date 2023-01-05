package br.com.udemy.employee;

import java.text.DecimalFormat;

public class Employee {
	
	String name;
	Double grossSalary;
	Double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double porcentage) {
		grossSalary += grossSalary * (porcentage / 100);
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("R$ #,#00.00");
		return "Employee: " + name + ", " + df.format(netSalary());
	}
}
