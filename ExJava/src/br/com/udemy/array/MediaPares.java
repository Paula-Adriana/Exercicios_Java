package br.com.udemy.array;

import java.util.Scanner;

public class MediaPares {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");
		int num = sc.nextInt();
		
		int[] vetor = new int[num];
		int soma = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
			if (vetor[i] % 2 == 0) {
				soma += vetor[i];
			}
		}
		double media = soma / num;
		if (soma == 0) {
			System.out.println("Nenhum número par");
		} else {
			System.out.println("Média dos pares: " + media);
		}
		
		sc.close();
	}
}
