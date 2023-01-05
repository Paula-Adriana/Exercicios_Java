package br.com.udemy.membrosEstaticos.versao2;

import java.util.Scanner;

public class versao02 {

	// Com membros de instancia. 
	//Precisa instanciar um objeto da Calculator para usar os métodos.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calculator2 calc = new Calculator2();
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();

		//membro a partir do objeto calc
		double c = calc.circumference(radius);

		//membro a partir do objeto calc
		double v = calc.volume(radius);

		System.out.println("Circumference: " + c);
		System.out.println("Volume: " + v);
		System.out.println("PI: " + calc.PI);

		sc.close();
	}

}
