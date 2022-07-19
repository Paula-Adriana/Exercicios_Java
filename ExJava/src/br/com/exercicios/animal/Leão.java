package br.com.exercicios.animal;

public class Leão extends Animal {

	public Leão(String nome, int idade, String cor) {
		super(nome, idade, cor);
	}

	@Override
	public String mostrarSom() {
		return EnumAnimal.LEÃO.getTipo();
	}
	
	

}
