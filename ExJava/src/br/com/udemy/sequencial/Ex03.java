package br.com.udemy.sequencial;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");
		int num1 = sc.nextInt();

		System.out.print("Digite o primeiro valor: ");
		int num2 = sc.nextInt();

		System.out.print("Digite o primeiro valor: ");
		int num3 = sc.nextInt();

		System.out.print("Digite o primeiro valor: ");
		int num4 = sc.nextInt();
		
		System.out.println("A diferen�a do produto A e B pelo produto de C e D �: " + 
		((num1*num2) - (num3*num4)));
		
		sc.close();
	}
}