package br.com.udemy.matriz;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int neg = 0;
		
		System.out.print("Digite a ordem da matriz: ");
		int order = sc.nextInt();

		int[][] matriz = new int[order][order];// bidimensional

		for (int i = 0; i < matriz.length; i++) { // lê a linha
			for (int j = 0; j < matriz[i].length; j++) { // lê a coluna
				matriz[i][j] = sc.nextInt();
				if (matriz[i][j] < 0) {
					neg++;
				}
			}
		}
		System.out.println("Main diagonal:");
		for (int k = 0; k < matriz.length; k++) {
			System.out.print(matriz[k][k] + " ");
		}
		System.out.println();
		System.out.println("Número de negativos = " + neg);
			sc.close();
	}
}
