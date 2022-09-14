package br.com.variados;

import java.util.Scanner;

public class PesoIdeal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double pesoIdeal;

		System.out.print("Digite sua altura: ");
		double altura = entrada.nextDouble();

		System.out.print("Sexo: F | M: ");
		String sexo = entrada.next();

		if (sexo == "M") {
			pesoIdeal = (72.7 * altura) - 58;
		} else {
			pesoIdeal = (62.1 * altura) - 44.7;
		}

		System.out.print("Informe seu peso: ");
		double peso = entrada.nextDouble();

		if (peso == pesoIdeal) {
			System.out.println("Seu peso está normal!");
		} else if (peso < pesoIdeal) {
			System.out.println("Você está abaixo do peso ideal!");
		} else {
			System.out.println("Você está acima do peso ideal!");
		}

		entrada.close();
	}
}
