package br.com.loiane.basicos;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int num1 = entrada.nextInt();

		System.out.println("Digite o segundo número: ");
		int num2 = entrada.nextInt();

		System.out.println("Digite o terceiro número: ");
		int num3 = entrada.nextInt();

		if ((num1 >= num2) && (num1 >= num3)) {
			System.out.print(num1 + " - ");
		} else if ((num2 >= num1) && (num2 >= num3)) {
			System.out.print(num2 + " - ");
		} else {
			System.out.print(num3 + " - ");
		}

		if ((num1 >= num2) && (num1 <= num3)) {
			System.out.print(num1 + " - ");
		} else if ((num2 >= num1) && (num2 <= num3)) {
			System.out.print(num2 + " - ");
		} else {
			System.out.print(num3 + " - ");
		}

		if ((num1 <= num2) && (num1 <= num3)) {
			System.out.print(num1);
		} else if ((num2 <= num1) && (num2 <= num3)) {
			System.out.print(num2);
		} else {
			System.out.print(num3);
		}
		entrada.close();
	}
}
