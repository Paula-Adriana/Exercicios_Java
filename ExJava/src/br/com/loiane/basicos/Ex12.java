package br.com.loiane.basicos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("R$#,##0.00");
		
		System.out.print("Digite o valor da hora trabalhada: ");
		double hora = entrada.nextDouble();
		
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		double quantidadeHorasTrabalhadas = entrada.nextDouble();
		
		double salarioBruto = hora * quantidadeHorasTrabalhadas;
		double percentualIR = 0;
		double INSS = salarioBruto * 0.10;
		double FGTS = salarioBruto * 0.11;
		double sindicato = salarioBruto * 0.03;
		
		
		
		if (salarioBruto <= 900) {
			percentualIR = 0;
		} else if (salarioBruto <= 1500) {
			percentualIR = 5;
		} else if (salarioBruto <= 2500) {
			percentualIR = 10;
		} else {
			percentualIR = 20;
		}
		
		double impostoRenda = salarioBruto * (percentualIR / 100);
		double totalDescontos = impostoRenda + INSS + sindicato;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println();
		System.out.println("============================================");
		System.out.println("Salário Bruto: (" + hora + " * " + quantidadeHorasTrabalhadas + 
				") :  " + formatador.format(salarioBruto));
		System.out.println("(-) IR (" + percentualIR + "%)			" + formatador.format(impostoRenda));
		System.out.println("(-) INSS (" + INSS + "%)			" + formatador.format(INSS));
		System.out.println("FGTS (" + FGTS + "%)			" + formatador.format(FGTS));
		System.out.println("Sindicato:			" + formatador.format(sindicato));
		System.out.println("Total de descontos:		" + formatador.format(totalDescontos));
		System.out.println("Salário líquido:		" + formatador.format(salarioLiquido));
		System.out.println("============================================");
		
		entrada.close();
	}
}
