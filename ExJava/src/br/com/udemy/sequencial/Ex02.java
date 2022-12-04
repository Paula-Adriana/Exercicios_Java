package br.com.udemy.sequencial;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("##.####");
		
		System.out.println("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		
		double area = 3.14159 * (Math.pow(raio, 2));
		System.out.print("A área do círculo é de: " + format.format(area));
		
		sc.close();
	}
}
