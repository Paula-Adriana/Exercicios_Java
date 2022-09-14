package br.com.variados;

import java.util.Scanner;

public class AverageOfFive12 {

	public static void main(String[] args) {
		
		int num = 0, x = 1;
		Scanner input = new Scanner(System.in);
		System.out.print("Input the number you want to calculate the average: ");
		int n = input.nextInt();
		
		while (x <= n) {
			System.out.println("Input number " + "(" + x +")" + ":");
			num += input.nextInt();
			x += 1;
		}
		double avgn = (num /n);		
		System.out.println("The average is: " + avgn);
		
	}

}
