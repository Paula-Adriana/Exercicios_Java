package br.com.exercicios.loiane.aula15;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		int num = entrada.nextInt();
		if (num > 0) {
			System.out.println("O n�mero " + num + " � positivo!");
		} else {
			System.out.println("O n�mero " + num + " � negativo!");
		}

		entrada.close();
	}
}
