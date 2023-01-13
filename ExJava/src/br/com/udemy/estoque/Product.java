package br.com.udemy.estoque;

import java.text.DecimalFormat;

public class Product {

	private String name;
	private Double price;
	private int quantity;
	
	public Product() {
		super();
	}
	
	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Product(String name, Double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}

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
