package br.com.exercicios.animal;

import java.util.Scanner;

public class CadastroAnimal {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("******CADASTRO DE ANIMAIS******");
		System.out.println();
		
		System.out.print("Informe o nome do animal: ");
		String nome = entrada.next();
		
		System.out.print("Informe a idade: ");
		int idade = entrada.nextInt();
		
		System.out.print("Infome a cor: ");
		String cor = entrada.next();
		
		System.out.println("Informe o tipo do animal: ");
		System.out.println("1 - Gato");
		System.out.println("2 - Cachorro");
		System.out.println("3 - Leão");
		int numero = entrada.nextInt();
		cadastrarAnimal(numero);
		
	}

	private static void cadastrarAnimal(int numero) {
		
	}

	
	 
}
