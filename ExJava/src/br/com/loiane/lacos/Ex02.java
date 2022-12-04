package br.com.loiane.lacos;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome, senha = "";
		boolean dadosValidos = false;
		
		do {
			System.out.print("Digite seu nome de usuário: ");
			nome = entrada.next();
			System.out.print("Digite sua senha: ");
			senha = entrada.next();
			if (nome.equalsIgnoreCase(senha)){
				System.out.println("Nome de usuário não pode ser igual"
						+ " a senha. Digite novamente!");
				System.out.println();
			} else {
				dadosValidos = true;
				System.out.println("Nome de usuário e senha corretos!");
			}
		} while (!dadosValidos);
		
		entrada.close();
	}
}
