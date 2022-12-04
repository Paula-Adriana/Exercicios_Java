package br.com.loiane.basicos;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num = entrada.nextInt();
		
		if (num % 2 == 0) {
			System.out.print("É par!");
		} else {
			System.out.print("É ímpar!");
		}
		
		entrada.close();
		
	}
}
