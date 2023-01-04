package br.com.udemy.estoque;

import java.text.DecimalFormat;

public class Product {

	String name;
	double price;
	int quantity;

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("R$ #,#00.00");
		return "Name: "	+ name 
				+ ", price: " + df.format(price)
				+ ", quantity: " + quantity + " un" 
				+", Total " + df.format(totalValueInStock());
	}
}
