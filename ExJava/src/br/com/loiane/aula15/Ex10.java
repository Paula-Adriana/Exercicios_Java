package br.com.loiane.aula15;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a letra correspondente ao seu"
				+ " turno de estudo:\n M - Matutino |"
				+ "V - Vespertino | N-Noturno");
		String turno = entrada.next().toUpperCase();

		switch (turno) {
		case "M": {System.out.println("Bom dia!"); break;}
		case "V": {System.out.println("Boa tarde!"); break;}
		case "N": {System.out.println("Boa noite!"); break;}
		default:
			System.out.println("Valor inválido!");;
		}
		entrada.close();
	}
}
