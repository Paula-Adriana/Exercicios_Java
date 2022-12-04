package br.com.loiane.basicos;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro lado: ");
		int lado1 = entrada.nextInt();
		
		System.out.print("Digite o segundo lado: ");
		int lado2 = entrada.nextInt();
		
		System.out.print("Digite o terceiro lado: ");
		int lado3 = entrada.nextInt();
		
		if ((lado1 + lado2 >= lado3) || (lado2 + lado3 >= lado1) || (lado3 + lado1 >= lado2)){
			System.out.print("É um trinângulo ");
			if ((lado1 == lado2) && (lado1 == lado3)) {
				System.out.println("equilátero");
			} else if ((lado1 == lado2) || (lado1 == lado3)) {
				System.out.println("isósceles");
			} else {
				System.out.println("escaleno");
			}
		} else {
			System.out.println("Os três lados informados não formam um trinângulo.");
		}
		
		
		
		
		entrada.close();
	
}
}
