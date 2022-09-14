package br.com.variados;

import java.util.Scanner;

public class Produto {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int num1 = entrada.nextInt();

		System.out.print("Digite o segundo número: ");
		int num2 = entrada.nextInt();

		System.out.print("Digite o terceiro número: ");
		int num3 = entrada.nextInt();

		System.out.println("Produto do dobro do primeiro com metade do segundo: " + ((num1 * 2) * (num2 / 2)));
		System.out.println("A soma do triplo do primeiro com o terceiro: " + ((num1 * 3) + (num3)));
		System.out.println("Terceiro elevado ao cubo: " + (Math.pow(num3, 3)));

		entrada.close();
	}
}