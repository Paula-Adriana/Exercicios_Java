package br.com.loiane.basicos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		DecimalFormat formatador = new DecimalFormat("R$#,##0.00");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Preço do primeiro produto: ");
		double preco1 = entrada.nextDouble();

		System.out.println("Preço do segundo produto: ");
		double preco2 = entrada.nextDouble();

		System.out.println("Preço do terceiro produto: ");
		double preco3 = entrada.nextDouble();

		if ((preco1 <= preco2) && (preco1 <= preco3)) {
			System.out.println("Compre o primeiro produto! valor de : " + formatador.format(preco1));
		} else if ((preco2 <= preco1) && (preco2 <= preco3)) {
			System.out.println("Compre o segundo produto! valor de : " + formatador.format(preco2));
		} else {
			System.out.println("Compre o terceiro produto! valor de : " + formatador.format(preco3));
		}
		entrada.close();
	}
}
