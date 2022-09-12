package br.com.exercicios.loiane.aula15;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o sexo: F | M : ");
		String sexo = entrada.next().toUpperCase();
		
		switch (sexo) {
		case "F": {
			System.out.println("F - Feminino");
			break;
		}
		case "M": {
			System.out.println("M - Masculino");
			break;
		}
		default:
			System.out.println("Sexo inválido");
		}
		entrada.close();
	}
}
