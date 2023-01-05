package br.com.udemy.student;

public class Student {
	
	String name;
	Double grade01;
	Double grade02;
	Double grade03;
	
	public double finalGrade() {
		return grade01 + grade02 + grade03;
	}
	
	public String result() {
		if (finalGrade() > 60) {
			return "PASS";
		} else {
			return "FAILED";
		}
	}
	
	public double missingPoints() {
		return 60 - finalGrade();
	}
	
	@Override
	public String toString() {
		if (result() == "PASS") {
			return "Final Grade: " + finalGrade() + " \n" + result();
		} else {
			return "Final Grade: " + finalGrade() + " \n" + result() + "\nMissing " + missingPoints() + " points."; 
		}
	}
	
}
