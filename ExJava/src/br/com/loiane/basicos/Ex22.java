package br.com.loiane.basicos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex22 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#,##0.00");
		
		System.out.print("Digite a quantidade de morango (kg): ");
		double morango = entrada.nextDouble();
		
		System.out.print("Digite a quantidade de maçãs (kg): ");
		double maca = entrada.nextDouble();
		
		double valorMorangoAte5kg = 2.50;
		double valorMorangoAcima5kg = 2.20;
		double valorMacaAte5kg = 1.80;
		double valorMacaAcima5kg = 1.50;
		
		double totalMorango = 0;
		double totalMaca = 0;
		
		if (morango <= 5) {
			totalMorango = morango * valorMorangoAte5kg;
		} else {
			totalMorango = morango * valorMorangoAcima5kg;
		}
		
		if (maca <= 5) {
			totalMaca = maca * valorMacaAte5kg;
		} else {
			totalMaca = maca * valorMacaAcima5kg;
		}
		double totalCompra = totalMaca+totalMorango;
		System.out.println("Total da compra: " + formatador.format(totalCompra));
		
		int desconto = 0;
		
		
		if (((maca + morango) >= 8) || (totalCompra >= 25)) {
			desconto = 10;
			
		double totalDesconto = (totalCompra / 100) * desconto;
		totalCompra = totalCompra - totalDesconto;
		System.out.println("Total com desconto: " + formatador.format(totalCompra));
		}
		
		entrada.close();
	}
}
