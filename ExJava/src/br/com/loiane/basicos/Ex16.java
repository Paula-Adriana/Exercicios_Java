package br.com.loiane.basicos;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor de a: ");
		int a = entrada.nextInt();
		if (a == 0) {
			System.out.println("Valor de 'a' deve ser diferente de zero! Programa encerrado!");
		} else {
			System.out.print("Digite o valor de b: ");
			int b = entrada.nextInt();

			System.out.print("Digite o valor de c: ");
			int c = entrada.nextInt();

			double delta = Math.pow(b, 2) - (4 * a * c);
			double x1 = ((-b) + Math.sqrt(delta)) / (2 *a);
			double x2 = ((-b) - Math.sqrt(delta)) / (2 *a);

			if (delta < 0) {
				System.out.println("Não possui raízes reais. Delta negativo");
			} else if (delta == 0) {
				System.out.println("x1: " + x1);
			} else {
				System.out.println("x1: " + x1 + " " + "x2: " + x2);
			}
			
			
		}

		entrada.close();
	}
}
