package br.com.udemy.array;

import java.util.Scanner;

public class Pares {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números voce vai digitar? ");
		int num = sc.nextInt();
		int[] vetor = new int[num];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		int cont = 0;
		System.out.print("Números pares: ");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 ==0) {
				System.out.print(vetor[i] + " ");
				cont ++;
			}
		}
		System.out.println();
		System.out.println("Quantidade de pares: " + cont);
		
		sc.close();
	}
}
