package br.com.udemy.condicional;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("R$ #.00");
		
		System.out.println("Digite o código do item (1-5): ");
		int item = sc.nextInt();
		
		System.out.println("Digite a quantidade: ");
		int qtdade = sc.nextInt();
		
		
		double total;
		if (item == 1) {
			total = qtdade * 4.0;
		} else if (item == 2) {
			total = qtdade * 4.50;
		} else if (item == 3) {
			total = qtdade * 5.0;
		} else if (item == 4) {
			total = qtdade * 2.0;
		} else {
			total = qtdade * 1.50;
		}
		
		System.out.println("Total: " + format.format(total));
		sc.close();
	}
}
