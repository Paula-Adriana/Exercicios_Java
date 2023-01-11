package br.com.udemy.array;

import java.util.Scanner;

public class Aprovados {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos alunos serão digitados: ");
		int num = sc.nextInt();

		String[] nomes = new String[num];
		double[] nota1 = new double[num];
		double[] nota2 = new double[num];

		for (int i = 0; i < num; i++) {
			System.out.println((i + 1) + "º aluno: ");
			System.out.print("Nome: ");
			nomes[i] = sc.next();

			System.out.print("Primeira nota: ");
			nota1[i] = sc.nextDouble();

			System.out.print("Segunda nota: ");
			nota2[i] = sc.nextDouble();
		}

		System.out.println("Alunos aprovados: ");
		for (int i = 0; i < num; i++) {
			double media = nota1[i] + nota2[i] / 2;

			if (media >= 6) {
				System.out.println(nomes[i]);
			}
		}
		sc.close();
	}
}
