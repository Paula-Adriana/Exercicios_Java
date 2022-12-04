package br.com.loiane.lacos;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		boolean infoValida = false;
		String nome = "";
		do {
			System.out.println("Digite seu nome: ");
			nome = entrada.next();
			if (nome.length() < 3) {
				System.out.println("Nome inválido, deve conter pelo menos 3 caracteres");
			} else {
				infoValida = true;
			}

		} while (!infoValida);

		infoValida = false;
		int idade = 0;
		do {
			System.out.println("Digite sua idade: ");
			idade = entrada.nextInt();
			if ((idade < 0) || (idade > 150)) {
				System.out.println("Idade inválida");
			} else {
				infoValida = true;
			}
		} while (!infoValida);

		infoValida = false;
		double salario = 0;
		do {
			System.out.println("Digite seu salário: ");
			salario = entrada.nextDouble();
			if (salario < 0) {
				System.out.println("Salário inválido");
			} else {
				infoValida = true;
			}
		} while (!infoValida);

		infoValida = false;
		String sexo = "";
		do {
			System.out.println("Digite seu sexo: f | m");
			sexo = entrada.next();
			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infoValida = true;
			} else {
				System.out.println("Sexo inválido");
			}
		} while (!infoValida);

		infoValida = false;
		String estadoCivil = "";
		do {
			System.out.println("Digite seu estado civil: s | c | v | d ");
			estadoCivil = entrada.next().toLowerCase();
			if (estadoCivil.equalsIgnoreCase("s") ||
			    estadoCivil.equalsIgnoreCase("c")  ||
			    estadoCivil.equalsIgnoreCase("v")  ||
			    estadoCivil.equalsIgnoreCase("d")) {
				infoValida = true;
				System.out.println("Dados corretos!");
			} else {
				System.out.println("Estado civil inválido");
			}
		} while (!infoValida);

		entrada.close();

	}
}
