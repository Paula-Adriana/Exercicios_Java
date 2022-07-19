package br.com.exercicios;

import java.util.Scanner;

public class HelloWorld1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("What´s your first name? ");
		String name = input.next();
		System.out.print("What´s your last name? ");
		String lastname = input.next();

		System.out.println("Hello, \n" + name + " " + lastname);

	}

}
