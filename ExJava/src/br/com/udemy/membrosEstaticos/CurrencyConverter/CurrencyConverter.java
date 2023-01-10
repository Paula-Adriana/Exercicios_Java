package br.com.udemy.membrosEstaticos.CurrencyConverter;

public class CurrencyConverter {

	public static Double IOF = 0.06;
	
	public static double dollarToReal(double amount, double dollarPrice) {
		return  amount * dollarPrice * (1 + IOF);
	}
	
}
