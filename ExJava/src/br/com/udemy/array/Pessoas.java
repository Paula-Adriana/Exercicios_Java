package br.com.udemy.array;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Pessoas {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.print("Quantas pessoas serão digitadas: ");
		int num = sc.nextInt();
		
		String[] nome = new String[num];
		int[] idade = new int[num];
		double[] altura = new double[num];
		
		double somaAltura = 0, mediaAltura, percentualMenores;
		int menorIdade = 0;
		
		for (int i = 0; i < num; i++) {
			System.out.print("Nome da " + (i+1) + "ª pessoa: ");
			nome[i] = sc.next();
			
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			if (idade[i] < 16) {
				menorIdade++;
			}
			
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			somaAltura += altura[i];
		}
		mediaAltura = somaAltura / num;
		percentualMenores = ((double)menorIdade/num) * 100;
		System.out.println("Altura média: " + df.format(mediaAltura));
		System.out.println("Pessoas com menos de 16 anos: " + percentualMenores + "%");
		
		for (int i = 0; i < idade.length; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		sc.close();
	}
}
