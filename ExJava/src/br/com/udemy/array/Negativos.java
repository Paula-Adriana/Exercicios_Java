package br.com.udemy.array;

import java.util.Scanner;

public class Negativos {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int num = sc.nextInt();
		int[] vetorNegativo = new int[num];
		
		for (int i = 0; i < vetorNegativo.length; i++) {
			System.out.print("Digite um número: ");
			vetorNegativo[i] = sc.nextInt();
		}
		System.out.println("Números negativos: ");
		for (int i = 0; i < vetorNegativo.length; i++) {
			if (vetorNegativo[i] < 0) {
				System.out.println(vetorNegativo[i]);
			}
		}
		sc.close();
	}
}
