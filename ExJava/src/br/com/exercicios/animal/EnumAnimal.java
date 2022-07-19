package br.com.exercicios.animal;

public enum EnumAnimal {

	GATO(1, "miau"),
	CACHORRO(2, "auau"),
	LEÃO(3, "uarr");

	private final int numero;
	private final String tipo;

	EnumAnimal(int numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
	}

	public int getNumero() {
		return numero;
	}

	public String getTipo() {
		return tipo;
	}
	
	
}
