package br.com.loiane.basicos;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		char conceito = '0';
		double media = (nota1 + nota2) / 2;
		if (media >= 9) {
			conceito = 'A';
		} else if (media >= 7.5) {
			conceito = 'B';
		} else if (media >= 6) {
			conceito = 'C';
		} else if (media >= 4) {
			conceito = 'D';
		} else {
			conceito = 'E';
		}
		
		String aproveitamento = "";
		
		if ((conceito == 'A') || (conceito ==  'B') || (conceito == 'C')) {
			aproveitamento = "Aprovado";
		} else {
			aproveitamento = "Reprovado";
		}
			
		System.out.println("=================================");
		System.out.println("Nota 01: " + nota1);
		System.out.println("Nota 02: " + nota2);
		System.out.println("Média: " + media);
		System.out.println("Conceito: " + conceito);
		System.out.println("Aproveitamento: " + aproveitamento);
		System.out.println("=================================");
		entrada.close();
	}
}
