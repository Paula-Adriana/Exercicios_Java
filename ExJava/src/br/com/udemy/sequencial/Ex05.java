package br.com.udemy.sequencial;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("R$ #.##");
		
		System.out.println("Digite o código da peça 1: ");
		int codigoPeca = sc.nextInt();
		
		System.out.println("Digite o número de peças: ");
		int numPeca = sc.nextInt();
		
		System.out.println("Digite o valor unitário: ");
		double valor = sc.nextDouble();
		
		System.out.println("Digite o código da peça 2: ");
		int codigoPeca2 = sc.nextInt();
		
		System.out.println("Digite o número de peças: ");
		int numPeca2 = sc.nextInt();
		
		System.out.println("Digite o valor unitário: ");
		double valor2 = sc.nextDouble();
		
		double valorFinal = ((numPeca * valor) + (numPeca2 * valor2));
		System.out.println("Valor a ser pago: " + format.format(valorFinal));
		sc.close();
	}
}
