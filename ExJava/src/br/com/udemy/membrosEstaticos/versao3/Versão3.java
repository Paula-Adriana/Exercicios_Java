package br.com.udemy.membrosEstaticos.versao3;

import java.util.Scanner;


public class Versão3 {

	//versão 3 com métodos estáticos
	//sem instanciamento
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();

		//membro a partir da classe
		double c = Calculator3.circumference(radius);

		//membro a partir da classe
		double v = Calculator3.volume(radius);

		System.out.println("Circumference: " + c);
		System.out.println("Volume: " + v);
		System.out.println("PI: " + Calculator3.PI);

		sc.close();
	}
}
