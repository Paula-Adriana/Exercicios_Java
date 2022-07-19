package br.com.exercicios;

import java.util.Scanner;

public class SumOfTwoNumbers2 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Type the first number: ");
	int num1 = input.nextInt();
	System.out.print("Type the second one: ");
	int num2 = input.nextInt();
	System.out.println();
	System.out.println("The sum between " + num1 + " + " + num2 + " is: " + (num1+num2));
}
}
