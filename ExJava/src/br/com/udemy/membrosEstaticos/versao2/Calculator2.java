package br.com.udemy.membrosEstaticos.versao2;

public class Calculator2 {

	
	final double PI = 3.14159;
	
	double circumference(double radius) {
		return 2 * PI * radius;
	}

	double volume(double radius) {
		return 4 * PI * Math.pow(radius, 3) / 3;
	}

}
