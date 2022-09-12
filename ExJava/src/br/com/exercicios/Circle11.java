package br.com.exercicios;

import java.util.Scanner;

public class Circle11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Input the radius of the circle: ");
		double radius = input.nextDouble();
		
		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * Math.pow (radius, 2);
		
		System.out.println("The perimeter is: " + perimeter);
		System.out.println("The area is: " + area);
	}

}
