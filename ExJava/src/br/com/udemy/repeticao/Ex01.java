package br.com.udemy.repeticao;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int senhaCorreta = 2002;
		int senhaDigitada;
		System.out.println("Digite a senha: ");
		senhaDigitada = sc.nextInt();
		while (senhaCorreta != senhaDigitada) {
			System.out.println("Senha inválida");
			System.out.println("Digite novamente: ");
			senhaDigitada = sc.nextInt();
		}
			
		System.out.println("Acesso permitido");
		sc.close();
	}
	

}
