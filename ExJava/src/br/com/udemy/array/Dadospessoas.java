package br.com.udemy.array;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Dadospessoas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Quantas pessoas serão digitadas: ");
		int num = sc.nextInt();
		
		double[] altura = new double[num];
		char[] sexo = new char[num];
		double maiorAltura = 0, menorAltura = 0;
		double somaAltura = 0;
		int contMulher = 0, contHomem = 0;
		
		for (int i = 0; i < num; i++) {
			System.out.print("Altura da " + (i+1) + "ª pessoa: ");
			altura[i] = sc.nextDouble();
			if (i == 0) {
				menorAltura = altura[0];
				maiorAltura = altura[0];
			}
			
			if (altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
			
			System.out.print("Gênero da " + (i+1) + "ª pessoa (f|m): ");
			sexo[i] = sc.next().charAt(0);
			if (sexo[i] == 'f') {
				somaAltura += altura[i];
				contMulher++;
			}else {
				contHomem++;
			}
		}
		double media = somaAltura / contMulher;
		System.out.println("Menor altura: " + menorAltura);
		System.out.println("Maior altura: " + maiorAltura);
		System.out.println("Média altura mulheres: " + df.format(media));
		System.out.println("Número de homens: " + contHomem);
		
		sc.close();
	}
}
