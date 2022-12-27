package br.com.udemy.repeticaoComWhile;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a coordenada X: ");
		int x = sc.nextInt();

		System.out.println("Digite a coordenada y: ");
		int y = sc.nextInt();

		while ((x != 0) && (y != 0)) {
			
			if ((x >= 0) && (y >= 0)) {
				System.out.println("primeiro");
			} else if ((x <= 0) && (y >= 0)) {
				System.out.println("segundo");
			} else if ((x <= 0) && (y <= 0)) {
				System.out.println("terceiro");
			} else if ((x >= 0) && (y <= 0)) {
				System.out.println("quarto");
			}
			System.out.println("Digite os próximos pontos: ");
			x = sc.nextInt();
			y = sc.nextInt();
			
		}

		sc.close();

	}
}
