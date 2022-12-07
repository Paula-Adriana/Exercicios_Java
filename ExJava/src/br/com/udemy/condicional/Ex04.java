package br.com.udemy.condicional;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a hora inicial: ");
		int horaInicial = sc.nextInt();
		
		System.out.println("Digite a hora final: ");
		int horaFinal = sc.nextInt();
		
		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal = horaInicial;
		} else {
			duracao = 24 - (horaInicial - horaFinal);
		}
		System.out.println("O jogo durou: " + duracao + " horas.");
		sc.close();
	}
}
