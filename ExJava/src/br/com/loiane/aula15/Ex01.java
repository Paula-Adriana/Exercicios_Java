package br.com.loiane.aula15;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		int num1 = entrada.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int num2 = entrada.nextInt();
		
		if (num1 > num2) {
			System.out.println("O maior número digitado foi: " + num1);
		} else {
			System.out.println("O maior número digitado foi: " + num2);
		}
		entrada.close();
	}
}
