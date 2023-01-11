package br.com.udemy.array.produto;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayTipoReferencia {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Digite o número total de produtos: ");
		int numeroProduto = sc.nextInt();
		
		Produto[] prod = new Produto[numeroProduto];
		double somaPreco = 0;
		
		for (int i = 0; i < prod.length; i++) {
			System.out.print("Digite o produto: ");
			String name = sc.next();
			double price = sc.nextDouble();
			prod[i] = new Produto(name, price);
			somaPreco += prod[i].getPrice();
		}
		double media = somaPreco / numeroProduto;
		System.out.println("Média de preço: " + df.format(media));
				
		sc.close();
	}
}
