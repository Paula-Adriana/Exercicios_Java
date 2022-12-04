package br.com.loiane.basicos;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Telefonou para a v�tima? (S | N) ");
		String telefone = entrada.next().toUpperCase();
		
		System.out.print("Esteve no local do crime? (S | N) ");
		String local = entrada.next().toUpperCase();
		
		System.out.print("Mora perto da v�tima? (S | N) ");
		String moradia = entrada.next().toUpperCase();
		
		System.out.print("Devia para a v�tima? (S | N) ");
		String dinheiro = entrada.next().toUpperCase();
		
		System.out.print("J� trabalhou com a v�tima? (S | N) ");
		String trabalha = entrada.next().toUpperCase();
		
		int cont = 0;
		if (telefone.equalsIgnoreCase("S")) {
			cont ++;
		}
		if (local.equalsIgnoreCase("S")) {
			cont ++;
		}
		if (moradia.equalsIgnoreCase("S")) {
			cont ++;
		}
		if (dinheiro.equalsIgnoreCase("S")) {
			cont ++;
		}
		if (trabalha.equalsIgnoreCase("S")) {
			cont ++;
		}
			
		System.out.println("Resultado: " + cont + " pontos.");
		
		if (cont <= 1) {
			System.out.println("Classifica��o: Inocente");
		} else if (cont == 2) {
			System.out.println("Classifica��o: Suspeito");
		} else if (cont <= 4) {
			System.out.println("Classifica��o: C�mplice");
		} else {
			System.out.println("Classifica��o: Assassino");
		}
		entrada.close();
	}
}
