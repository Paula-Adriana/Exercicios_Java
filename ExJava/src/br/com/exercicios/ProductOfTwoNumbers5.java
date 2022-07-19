package br.com.exercicios;

import java.util.Scanner;

public class ProductOfTwoNumbers5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type the first number: ");
		int num1 = input.nextInt();
		System.out.print("Type the second number: ");
		int num2 = input.nextInt();
		System.out.println("The product between " + num1 + " and " + num2 + " is: " + (num1*num2));;
	}

}
