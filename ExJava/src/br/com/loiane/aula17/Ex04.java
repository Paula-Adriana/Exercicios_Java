package br.com.loiane.aula17;

public class Ex04 {
	public static void main(String[] args) {
		
		double popA = 80000;
		double popB = 200000;
		int contador = 0;
		
		while (popA <= popB) {
			popA += (popA/100) * 3;
			contador++;
			popB += (popB/100) * 1.5;
		}
			
		
		System.out.println("Levar� "+ contador + " anos para a popula��o A igualar a popula��o B.");
	}
}
