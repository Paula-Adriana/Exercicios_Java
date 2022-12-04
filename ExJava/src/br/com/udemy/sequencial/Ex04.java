package br.com.udemy.sequencial;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		DecimalFormat format = new DecimalFormat("R$ #,##0.00");

		System.out.print("Digite o número do funcionário: ");
		int numero = sc.nextInt();
		
		System.out.print("Digite o número de horas trabalhadas: ");
		int horas = sc.nextInt();
		
		System.out.print("Digite o valor por hora: ");
		double valorHora = sc.nextDouble();
		
		double salario = horas * valorHora;
		System.out.println("Número do funcionário: " + numero);
		System.out.println("Salário: " + format.format(salario));
		
		sc.close();
	}
}
