package br.com.udemy.repeticaoComFor;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		System.out.println(factorial(num));
		sc.close();
	}
	private static int factorial(int i) {
		if (i == 0) {
			return 1;				
		}
	return i * factorial(i - 1);
}
}
