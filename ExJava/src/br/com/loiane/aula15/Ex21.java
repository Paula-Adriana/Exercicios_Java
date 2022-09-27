package br.com.loiane.aula15;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex21 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#,##0.00");
		
		System.out.print("Digite a quantidade de litros: ");
		double litros = entrada.nextDouble();
		
		System.out.println("Digite o tipo do combustível: A-álcool | G-gasolina");
		String tipoCombust = entrada.next().toUpperCase();
		
		double total = 0;
		double desconto = 0;
		double valorAlcool = 1.90;
		double valorGasolina = 2.50;
		double valorComDesconto = 0;
		double valorAPagar = 0;
		
		if (tipoCombust.equalsIgnoreCase("A")) {
			if (litros <= 20) {
				desconto = 3; 
			} else {
				desconto = 5;
			}
			total = litros * valorAlcool;
		} else {
			if (litros <= 20) {
				desconto = 4;  
			} else {
				desconto = 6; 
			}
			total = litros * valorGasolina;
		}
		
		valorComDesconto = (total / 100) * desconto;
		valorAPagar = total - valorComDesconto;
		
		
		System.out.println("Tipo de combustível: " + tipoCombust);
		System.out.println("Quantidade de litros: " + litros);
		System.out.println("Total: " + formatador.format(total));
		System.out.println("Desconto: " + formatador.format(valorComDesconto));
		System.out.println("Valor a ser pago: " + formatador.format(valorAPagar));
		entrada.close();
	}
}
