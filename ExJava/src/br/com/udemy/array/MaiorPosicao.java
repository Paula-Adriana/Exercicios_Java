package br.com.udemy.array;

import java.util.Scanner;

public class MaiorPosicao {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("Quantos números você vai digitar: ");
	int num = sc.nextInt();
	
	int[] vetor = new int[num];
	
	int maior = 0, atual = 0, posicao = 0;
	for (int i = 0; i < vetor.length; i++) {
		System.out.print("Digite um valor: ");
		vetor[i] = sc.nextInt();
		if (vetor[i] > maior) {
			maior = vetor[i];
			posicao = i;
		}
	}
	System.out.println("Maior valor: " + maior);
	System.out.println("Posição: " + posicao);
	
	sc.close();
	}
}
