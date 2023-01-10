package br.com.udemy.membrosEstaticos.CurrencyConverter;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		Double dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		Double amount = sc.nextDouble();
		
		System.out.println("Amount to be paid in reais = " + CurrencyConverter.dollarToReal(amount, dollarPrice));
		
		sc.close();
	}
}
