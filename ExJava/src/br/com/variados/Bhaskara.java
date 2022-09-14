package br.com.variados;

import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("------Sistema para calcular a fórmula de Bhaskara------");
		System.out.println();

		System.out.print("Digite um valor para a: ");
		double a = entrada.nextInt();

		System.out.print("Digite um valor para b: ");
		double b = entrada.nextInt();

		System.out.print("Digite um valor para c: ");
		double c = entrada.nextInt();

		double delta = (b * b) - (4 * a * c);

		double x1 = -((b) + Math.sqrt(delta)) / (2 * a);
		double x2 = -(b - Math.sqrt(delta)) / (2 * a);
		
		System.out.println();
		System.out.println("------Resultado------");
		System.out.println();
		if (delta < 0) {
			System.out.println("Não existe raiz real para a equação");
		} else if (delta == 0) {
			System.out.println("x1 é igual a: " + x1);
		} else if (delta > 0) {
			System.out.println("x1 é igual a: " + x1);
			System.out.println("x2 é igual a: " + x2);
		}
		entrada.close();
	}
}
