package br.com.udemy.repeticaoComFor;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		
		sc.close();
		
	}
}
