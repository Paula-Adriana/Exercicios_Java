package br.com.exercicios.animal;

public class Le�o extends Animal {

	public Le�o(String nome, int idade, String cor) {
		super(nome, idade, cor);
	}

	@Override
	public String mostrarSom() {
		return EnumAnimal.LE�O.getTipo();
	}
	
	

}
