package br.com.loiane.arrays;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] vetorA = new int[5];
		int[] vetorB = new int[5];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite o valor da posição " + (i + 1) + ": ");
			vetorA[i] = entrada.nextInt();
			vetorB[i] = vetorA[i];
		}
		
		for (int j = 0; j < vetorA.length; j++) {
			System.out.println("Os valores digitados para o vetor A foram: " + vetorA[j]);
		}
		System.out.println();
		for (int j = 0; j < vetorA.length; j++) {
			System.out.println("Os valores digitados para o vetor B foram: " + vetorB[j]);
		}
		
		entrada.close();
	}
}
