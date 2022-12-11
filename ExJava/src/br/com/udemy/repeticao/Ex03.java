package br.com.udemy.repeticao;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tipo, alcool = 0, gasolina = 0, diesel = 0;

		System.out.println("Digite o tipo de combustivel: 1-Alcool | 2-Gasolina | 3-Diesel | 4-Fim: ");
		tipo = sc.nextInt();

		while ((tipo < 1) || (tipo > 4)) {
			System.out.println("Digite um código válido: ");
			tipo = sc.nextInt();
		}

		while ((tipo != 4)) {

			if (tipo == 1) {
				alcool += 1;
			} else if (tipo == 2) {
				gasolina += 1;
			} else if (tipo == 3) {
				diesel += 1;
			}
			System.out.println("Próximo tipo: ");
			tipo = sc.nextInt();

		}
		System.out.println("Muito obrigado!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}
}
