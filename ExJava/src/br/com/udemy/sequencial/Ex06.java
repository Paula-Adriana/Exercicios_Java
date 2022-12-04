package br.com.udemy.sequencial;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("#.00");
		System.out.println("Digite o valor de A: ");
		double a = sc.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		double b = sc.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		double c = sc.nextDouble();
		
		double areaTriangulo = (a*c) / 2;
		double areaCirculo = 3.14159 * (Math.pow(c, 2));
		double areaTrapezio = ((0.5*c) * (a+b));
		double areaQuadrado = b*b;
		double areaRetangulo = a*b;
		
		System.out.println("Triângulo: " + format.format(areaTriangulo));
		System.out.println("Círculo: " + format.format(areaCirculo));
		System.out.println("Trapézio: " + format.format(areaTrapezio));
		System.out.println("Quadrado: " + format.format(areaQuadrado));
		System.out.println("Retângulo: " + format.format(areaRetangulo));
		sc.close();
	}
}
