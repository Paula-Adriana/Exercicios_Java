package br.com.udemy.repeticaoComFor;

import java.util.Iterator;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números deseja digitar: ");
		int num = sc.nextInt();
		
		int in = 0, out = 0;
		for (int i = 0; i < num; i++) {
			System.out.println("Digite o número: ");
			int num1 = sc.nextInt();
			if ((num1 >= 10) && (num1 <= 20)) {
				in++;
			} else {
				out++;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		
		sc.close();
	}
}
