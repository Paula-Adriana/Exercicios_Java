package br.com.udemy.repeticaoComFor;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número positivo: ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.println(i + " " + Math.pow(i, 2) + " " + Math.pow(i, 3));
		}
		sc.close();
	}
}
