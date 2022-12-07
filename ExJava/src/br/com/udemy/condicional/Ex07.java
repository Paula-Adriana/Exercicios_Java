package br.com.udemy.condicional;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro ponto: ");
		float x = sc.nextFloat();

		System.out.println("Digite o segundo ponto: ");
		float y = sc.nextFloat();

		if ((x == 0) && (y == 0)) {
			System.out.println("Origem");
		} else if (x == 0) {
			System.out.println("Eixo X");
		} else if (y == 0) {
			System.out.println("Eixo Y");
		} else if ((x >= 0) && (y >= 0)) {
			System.out.println("Q1");
		} else if ((x <= 0) && (y >= 0)) {
			System.out.println("Q2");
		} else if ((x <= 0) && (y <= 0)) {
			System.out.println("Q3");
		} else if ((x >= 0) && (y <= 0)) {
			System.out.println("Q4");
		}
		sc.close();
	}
}
