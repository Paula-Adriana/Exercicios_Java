package br.com.variados;

import java.util.Scanner;

public class Operations6 {
 public static void main(String[] args) {
	 
	 Scanner input = new Scanner(System.in);
	 
	 System.out.print("Type a number: ");
	 int num1 = input.nextInt();
	 System.out.print("Type a second number: ");
	 int num2 = input.nextInt();
	 
	 System.out.println("The sum: " + (num1+num2));
	 System.out.println("The subtract: " + (num1-num2));
	 System.out.println("The division: " + (num1/num2));
	 System.out.println("The multiplication: " + (num1*num2));
}
}
