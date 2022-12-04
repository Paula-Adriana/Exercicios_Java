package br.com.loiane.basicos;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma letra do alfabeto: ");
		String letra = entrada.next().toUpperCase();

		if (letra.length() > 1) {
			System.out.println("Digite apenas uma letra!");
		} else {
			switch (letra) {
			case "A":
			case "E":
			case "I":
			case "O":
			case "U": {
				System.out.println("Vogal");
				break;
			}
			default:
				System.out.println("Consoante ");
			}
		}

		entrada.close();
	}
}
