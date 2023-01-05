package br.com.udemy.membrosEstaticos.versao1;

import java.util.Scanner;

public class Versao01 {
	

	/* uma classe possui membros: atritutos e métodos.
	 * Membros estáticos = membros de classe (são chamados a partir da classe)
	 * Membros "normais" = membros de instância (são chamados a partir do objeto)
	 * 
	 * Aplicação comum: classes utilitárias e declaração de constantes.
	 * */
	//versao 01: métodos estáticos na própria classe
	
	//membro estático - static
	//é uma constante - final (uma vez atribuido, não mudará)
	//letra maiuscula 
	private static final double PI = 3.14159;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		
		double v = volume(radius);
		
		System.out.println("Circumference: " + c);
		System.out.println("Volume: " + v);
		System.out.println("PI: " + PI);
		
		sc.close();
	}

	//membro estático
	private static double circumference(double radius) {
		return 2 *  PI * radius;
	}

	//membro estático
	private static double volume(double radius) {
		return 4 * PI * Math.pow(radius, 3) / 3;
	}
	/*
	 * Os membros são estáticos pq o método main, sendo estático,
	 * não aceitar chamadas de membros não estáticos dentro dele */
}
