package br.com.loiane.lacos;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double num = 0;
		boolean notaValida = true;
		
		do {
			System.out.print("Digite uma nota entre zero e dez: ");
			num = entrada.nextDouble();
			
			if ((num < 0) || (num > 10)) {
				System.out.println("Número inválido");
			} else {
				System.out.println("Voce digitou: " + num);
				notaValida = false;
			}
		} while (notaValida);
	
		entrada.close();
	}
}
