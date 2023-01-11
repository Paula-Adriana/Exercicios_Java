package br.com.udemy.array;

import java.util.Scanner;

public class MaisVelho {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas você vai digitar: ");
		int num = sc.nextInt();
		
		int[] idade = new int[num];
		String[] nome = new String[num];
		int maior = 0;
		String nomeMaisVelho = "";
		
		for (int i = 0; i < num; i++) {
			System.out.println("Dados da " + (i+1) + "ª pessoa: ");
			System.out.print("Nome: ");
			nome[i] = sc.next();
			
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			if (idade[i] > maior) {
				maior = idade[i];
				nomeMaisVelho = nome[i];
			}
		}
		System.out.println("Pessoa mais velha: " + nomeMaisVelho);
		
		sc.close();
	}
}
