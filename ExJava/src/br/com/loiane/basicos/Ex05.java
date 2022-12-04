package br.com.loiane.basicos;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		System.out.println("A média é : " + media);
		if (media == 10) {
			System.out.println("Aprovado com distinção!");
		} else if (media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado!");
		}
		
		
		entrada.close();
	}
}
