package br.com.variados;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Rectangle13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("#,##0.00");
		
		System.out.println("Input the width: ");
		double width = input.nextDouble();
		System.out.println("Input the height: ");
		double height = input.nextDouble();
		
		double perimeter = 2*(height + width);
		double area = width * height;
		
		System.out.println("The perimeter is: " + format.format(perimeter) 
		+ " and the area is: " + format.format(area));
	}
}
