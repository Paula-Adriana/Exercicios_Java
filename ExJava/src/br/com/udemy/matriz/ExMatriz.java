package br.com.udemy.matriz;

import java.util.Scanner;

public class ExMatriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número de linhas seguido do número de colunas: ");
		int[][] matriz = new int[sc.nextInt()][sc.nextInt()];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("Digite o número em uma posição: ");
		int num = sc.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (num == matriz[i][j]) {
					System.out.println("Position: " + i + "," + j);
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j - 1]);
					}
					if (j + 1 < matriz[i].length) {
						System.out.println("Right: " + matriz[i][j + 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i - 1][j]);
					}
					if (i + 1 < matriz.length) {
						System.out.println("Down: " + matriz[i + 1][j]);
					}
				}
			}
		}

		sc.close();
	}
}
