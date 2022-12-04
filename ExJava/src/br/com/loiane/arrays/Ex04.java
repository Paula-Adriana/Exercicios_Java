package br.com.loiane.arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");

		double[] vetorA = new double[3];
		double[] vetorB = new double[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite os valores de A: ");
			vetorA[i] = entrada.nextDouble();
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		
		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(df.format(vetorA[i]) + " ");
		}
		System.out.println();
		System.out.print("Vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(df.format(vetorB[i]) + " ");
		}
		
		entrada.close();
	}
}
