package br.com.loiane.aula17;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		boolean popValida = false;
		
		do {
			System.out.println("Digite a população A: ");
			double popA = entrada.nextDouble();
			System.out.println("Digite a taxa de crescimento da população A: ");
			double taxaA = entrada.nextDouble();
			System.out.println("Digite a população B: ");
			double popB = entrada.nextDouble();
			System.out.println("Digite a taxa de crescimento da população B: ");
			double taxaB = entrada.nextDouble();
			int contador = 0;

			if (popA > popB) {
				System.out.println("A população A deve ser menor que a B.");
			} else {
				while (popA <= popB) {
					popA += (popA / 100) * taxaA;
					contador++;
					popB += (popB / 100) * taxaB;
				}
				popValida = true;
				System.out.println("Levará " + contador + " anos para a população A igualar a população B.");
			}

		} while (!popValida);
	}
}
