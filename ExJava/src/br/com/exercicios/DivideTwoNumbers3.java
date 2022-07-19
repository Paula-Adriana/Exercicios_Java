package br.com.exercicios;

import java.util.Scanner;

public class DivideTwoNumbers3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num2;

		System.out.print("Type the first number: ");
		int num1 = input.nextInt();

		System.out.print("Type the second one: ");
		num2 = input.nextInt();
		while (num2 == 0) {
			System.out.println("Please, type a number that is different from zero.");
			System.out.print("Type the second one: ");
			num2 = input.nextInt();
		}
		int d = num1 / num2;

		System.out.println("The division of " + num1 + " and " + num2 + " is: " + d);

	}
}
