package br.com.udemy.estoque;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.next();
		
		System.out.print("Price: ");
		Double price = sc.nextDouble();
		
//		System.out.print("Quantity in stock: ");
//		int quantity = sc.nextInt();
		
		Product product = new Product(name, price);
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		product.addProducts(sc.nextInt());
		System.out.println();
		System.out.println("Update data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		product.removeProducts(sc.nextInt());
		System.out.println();
		System.out.println("Update data: " + product);
		sc.close();
	}
}
