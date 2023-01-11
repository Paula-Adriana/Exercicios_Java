package br.com.udemy.array;

import java.util.Scanner;

public class AbaixoMedia {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor: ");
		int num = sc.nextInt();
		
		double[] vetor = new double[num];
		double soma = 0, media;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o " + (i+1) + "º valor: ");
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}
		media = soma / num;
		System.out.println("Média: " + media);
		System.out.println("Elementos fora da média: ");
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < media) {
				System.out.println(vetor[i]);
			}
		}
		sc.close();
	}
}
