package br.com.udemy.list.employee;

import java.text.DecimalFormat;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setNome(String name) {
		this.name = name;
	}

	public Double getSalario() {
		return salary;
	}
	
	public void increaseSalary(double percentage) {
		this.salary =+ salary * (1 + percentage / 100);
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,#00.00");
		return id + ", " + name + ", " + df.format(salary);
	}
	
	
}
