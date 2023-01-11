package br.com.udemy.array;

import java.util.Iterator;
import java.util.Scanner;

public class SomaVetores {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos valores terá cada vetor? ");
		int num = sc.nextInt();
		
		int[] vetorA = new int[num];
		int[] vetorB = new int[num];
		int[] vetorC = new int[num];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite os valores de A: ");
			vetorA[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("Digite os valores de B: ");
			vetorB[i] = sc.nextInt();
		}
		System.out.println("Vetor resultante: ");
		for (int i = 0; i < vetorB.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.println(vetorC[i]);
		}
		
		
		
		sc.close();
	}
}
