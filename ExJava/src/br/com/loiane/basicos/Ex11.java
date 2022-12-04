package br.com.loiane.basicos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatadorSalario = new DecimalFormat("R$#,##0.00");
		DecimalFormat formatadorPorcentagem = new DecimalFormat("#.##");
		double reajuste = 0;
		double porcentagem = 0;
		
		
		System.out.println("Digite o salário: ");
		double salario = entrada.nextDouble();

		if (salario <= 280.00) {
			porcentagem = 0.20;
			reajuste = salario * porcentagem;
		} else if (salario <= 700) {
			porcentagem = 0.15;
			reajuste = salario * porcentagem;
		} else if (salario <= 1500) {
			porcentagem = 0.10;
			reajuste = salario * porcentagem;;
		} else {
			porcentagem = 0.05;
			reajuste = salario * porcentagem;
		}

		System.out.println("Salario anterior: " + salario);
		System.out.println("Percentual de aumento: " + formatadorPorcentagem.format(porcentagem));
		System.out.println("Reajuste: " + reajuste + " reais.");
		System.out.println("Salario atualizado: " + (formatadorSalario.format(salario + reajuste)) + " reais.");
		entrada.close();
	}
}
