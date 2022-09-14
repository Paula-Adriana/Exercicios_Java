package br.com.variados;

import java.util.Scanner;

public class Swap15 {

	public static void main(String[] args) {
		int temp;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type the first number: ");
		int num1 = input.nextInt();
		System.out.print("Type the second number: ");
		int num2 = input.nextInt();
		
		System.out.println("Before swapping: num1, num2 = " +num1 + ", " + num2);
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After swapping: num1, num2 = " +num1 + ", " + num2);
	}

}
