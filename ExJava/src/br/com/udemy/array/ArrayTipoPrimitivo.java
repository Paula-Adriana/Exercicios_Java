package br.com.udemy.array;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayTipoPrimitivo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.print("Digite o número total de alturas: ");
		int numeroAltura = sc.nextInt();
		
		double[] altura = new double[numeroAltura];
		double somaAltura = 0;
		
		for (int i = 0; i < altura.length; i++) {
			System.out.print("Digite a altura: ");
			altura[i] = sc.nextDouble();
			somaAltura += altura[i];
		}
		double media = somaAltura / numeroAltura;
		System.out.println("Média de alturas: " + df.format(media));
				
		sc.close();
	}
}
