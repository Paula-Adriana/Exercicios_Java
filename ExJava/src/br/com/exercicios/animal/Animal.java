package br.com.exercicios.animal;

public abstract class Animal {
	
	//atributos
	private String nome;
	private int idade;
	private String cor;
	private enum EnumAnimal {GATO, CACHORRO, LEÃO};
	
	//construtor
	public Animal(String nome, int idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	//metodos
	public abstract String mostrarSom();

	//ggas
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

		
	
}
