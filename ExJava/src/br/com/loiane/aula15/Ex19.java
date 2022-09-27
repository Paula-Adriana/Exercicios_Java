package br.com.loiane.aula15;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#,##0.00");

		System.out.print("Digite o primeiro n�mero: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Digite o segundo n�mero: ");
		double num2 = entrada.nextDouble();
		
		System.out.print("Qual opera��o deseja realizar? (+ - / *): ");
		String operacao = entrada.next();
		
		double resultado = 0;
		boolean opValida = true;
		
		switch (operacao) {
		case "+": resultado = num1 + num2; break;
		case "-": resultado = num1 - num2; break;
		case "/": resultado = num1 / num2; break;
		case "*": resultado = num1 * num2; break;
		default: 
			System.out.println("Opera��o inv�lida");
			opValida = false;
		}
		
		if (opValida) {
			
			System.out.print("O resultado �: " + formatador.format(resultado) + ". O n�mero � ");
		
			if (resultado % 2 == 0) {
				System.out.print("par e ");
			} else {
				System.out.print("�mpar e ");
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
