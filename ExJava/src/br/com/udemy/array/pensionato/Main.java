package br.com.udemy.array.pensionato;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Pensionato[] pensionato = new Pensionato[10];
		
		System.out.print("How many rooms will be rented? ");
		int numberOfRooms = sc.nextInt();
		
		for (int i = 0; i < numberOfRooms; i++) {
			System.out.println();
			System.out.println("Rent #" + (i+1) + ":");
			System.out.print("Name: ");
			sc.nextLine(); //buffer
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			pensionato[room] = new Pensionato(name, email);
		}
		System.out.println();
		System.out.println("Busy rooms:");
		
		for (int i = 0; i < pensionato.length; i++) {
			if (pensionato[i] != null) {
				System.out.println(i + ": " + pensionato[i]);
			}
		}
		sc.close();
	}
}
