package br.com.loiane.aula15;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#,##0.00");

		System.out.print("Digite o primeiro número: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		double num2 = entrada.nextDouble();
		
		System.out.print("Qual operação deseja realizar? (+ - / *): ");
		String operacao = entrada.next();
		
		double resultado = 0;
		boolean opValida = true;
		
		switch (operacao) {
		case "+": resultado = num1 + num2; break;
		case "-": resultado = num1 - num2; break;
		case "/": resultado = num1 / num2; break;
		case "*": resultado = num1 * num2; break;
		default: 
			System.out.println("Operação inválida");
			opValida = false;
		}
		
		if (opValida) {
			
			System.out.print("O resultado é: " + formatador.format(resultado) + ". O número é ");
		
			if (resultado % 2 == 0) {
				System.out.print("par e ");
			} else {
				System.out.print("ímpar e ");
			}
			
			if (resultado < 0) {
				System.out.println("negativo");
			} else {
				System.out.println("positivo");
			}
		}
		
		entrada.close();
	}
}
