package br.com.udemy.condicional;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor inteiro: ");
		int a = sc.nextInt();

		System.out.println("Digite um valor inteiro: ");
		int b = sc.nextInt();

		if ((b % a == 0) || (a % b == 0 )) {
			System.out.println("São múltiplos");
		} else {
			System.out.println("Não são múltiplos.");
		}
		sc.close();
	}
}
