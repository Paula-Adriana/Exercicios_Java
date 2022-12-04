package br.com.udemy.sequencial;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int num1 = sc.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int num2 = sc.nextInt();
		
		System.out.println("Os valores digitados foram: " + num1 + " e " + num2);
		System.out.println("A soma é de: " + (num1+num2));
				
		
		
		sc.close();
	}
}
