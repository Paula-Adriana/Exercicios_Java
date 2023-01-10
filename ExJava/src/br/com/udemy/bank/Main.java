package br.com.udemy.bank;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***Cadastro de conta - Banco teste***");
		System.out.println();
		System.out.print("Digite um número para sua conta: ");
		String numeroConta = sc.next();
		
		System.out.print("Digite o nome do titular: ");
		String nomeTitular = sc.next();
		
		System.out.print("Deseja fazer um depósito inicial? s|n: ");
		char depositoInicial = sc.next().charAt(0);
		
		
		Bank conta = new Bank(numeroConta, nomeTitular);
		if (depositoInicial == 's') {
			System.out.print("Digite o valor do depósito: ");
			conta.deposito(sc.nextDouble());
		}
		System.out.println("Dados da conta: \n" + conta);
		System.out.println();
		
		System.out.print("Digite valor do depósito? ");
		conta.deposito(sc.nextDouble());
		System.out.println("Dados atualizados: \n" + conta);
		System.out.println();
		
		System.out.print("Digite valor do saque: ");
		conta.saque(sc.nextDouble());
		System.out.println("Dados atualizados: \n" + conta);

		sc.close();
	}
}
