package br.com.exercicios.animal;

public class Gato extends Animal {

	public Gato(String nome, int idade, String cor) {
		super(nome, idade, cor);
	}

	@Override
	public String mostrarSom() {
		return EnumAnimal.GATO.getTipo();
	}
	

}
