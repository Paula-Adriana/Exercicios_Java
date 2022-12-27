package br.com.udemy.repeticaoComFor;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		System.out.println("Digite o número de pares: ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			System.out.print("Primeiro numero: ");
			double num1 = sc.nextDouble();
			System.out.print("Segundo numero: ");
			double num2 = sc.nextDouble();
			
			if (num2 == 0) {
				System.out.println("Divisão impossível");
			} else {
				System.out.println(df.format(num1/num2));
			}
		}
		
		
		sc.close();
	}
}
