package br.com.udemy.rectangle;

import java.text.DecimalFormat;

public class Rectangle {
	
	Double width;
	Double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}
	
	public double diagonal() {
		return Math.sqrt((Math.pow(width, 2) + (Math.pow(height, 2))));
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.00");
		return "Área = " + df.format(area())
		+ " Perimeter = " + df.format(perimeter())
		+ " Diagonal = " + df.format(diagonal());
	}
}
