package br.com.exercicios.animal;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade, String cor) {
		super(nome, idade, cor);
	}

	@Override
	public String mostrarSom() {
		return EnumAnimal.CACHORRO.getTipo();
	}

}
