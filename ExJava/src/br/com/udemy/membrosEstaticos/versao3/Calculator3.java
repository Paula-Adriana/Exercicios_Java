package br.com.udemy.membrosEstaticos.versao3;

public class Calculator3 {

	
	final static double PI = 3.14159;
	
	 static double circumference(double radius) {
		return 2 * PI * radius;
	}

	static double volume(double radius) {
		return 4 * PI * Math.pow(radius, 3) / 3;
	}

}

