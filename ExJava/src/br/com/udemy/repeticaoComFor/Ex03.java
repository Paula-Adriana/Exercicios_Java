package br.com.udemy.repeticaoComFor;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		System.out.println("Quantos testes deseja digitar: ");
		int inicial = sc.nextInt();
		
		double media = 0;
		for (int i = 0; i < inicial; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Digite o teste número: " + j+1);
				double teste = sc.nextDouble();
				if (j == 0) {
					double peso1 = teste * 0.2;
					media += peso1;
				} else if (j == 1) {
					double peso2 = teste * 0.3;
					media += peso2;
				} else {
					double peso3 = teste * 0.5;
					media += peso3;
				}
			}
			System.out.println(df.format(media));
			media = 0;
			
		}
		
		
		sc.close();
	}
}
