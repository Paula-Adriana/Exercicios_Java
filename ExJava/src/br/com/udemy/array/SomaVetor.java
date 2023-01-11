package br.com.udemy.array;

import java.util.Scanner;

public class SomaVetor {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite quantos números serão lidos: ");
		int num = sc.nextInt();
		int[] vetor = new int [num];
		int soma = 0, media;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o valor: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.print("Valores: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
			soma += vetor[i];
		}
		
		media = soma / vetor.length;
		System.out.println();
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		
		
		
		
		sc.close();
	}
}
