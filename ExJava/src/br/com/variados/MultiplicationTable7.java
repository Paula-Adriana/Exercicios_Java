package br.com.variados;

import java.util.Iterator;
import java.util.Scanner;

public class MultiplicationTable7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Of which number would you like to see the"
				+ " multiplication table? ");
		int num = input.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num*i));
		}
	}

}
