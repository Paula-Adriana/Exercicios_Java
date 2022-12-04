package br.com.loiane.basicos;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o ano: ");
		int ano = entrada.nextInt();
		double div = 2016 / 4;
		if ((ano % 4 == 0) || (ano % 400 == 0) && (ano % 100 != 0)) {
			System.out.println("É bissexto");
		} else {
			System.out.println("Não é bissexto");
		}
			
		
		entrada.close();
	}
}
