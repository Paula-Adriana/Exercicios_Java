package br.com.udemy.membrosEstaticos.versao1;

import java.util.Scanner;

public class Versao01 {
	

	/* uma classe possui membros: atritutos e m�todos.
	 * Membros est�ticos = membros de classe (s�o chamados a partir da classe)
	 * Membros "normais" = membros de inst�ncia (s�o chamados a partir do objeto)
	 * 
	 * Aplica��o comum: classes utilit�rias e declara��o de constantes.
	 * */
	//versao 01: m�todos est�ticos na pr�pria classe
	
	//membro est�tico - static
	//� uma constante - final (uma vez atribuido, n�o mudar�)
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

	//membro est�tico
	private static double circumference(double radius) {
		return 2 *  PI * radius;
	}

	//membro est�tico
	private static double volume(double radius) {
		return 4 * PI * Math.pow(radius, 3) / 3;
	}
	/*
	 * Os membros s�o est�ticos pq o m�todo main, sendo est�tico,
	 * n�o aceitar chamadas de membros n�o est�ticos dentro dele */
}
