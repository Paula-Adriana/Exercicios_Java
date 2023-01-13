package br.com.udemy.list;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

public class List {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Marco");
		list.add("Ana");
		list.add("Beatriz");

		/*
		 * removendo por predicado predicado = função lambda, retorna um predicado ou
		 * seja V ou F. leitura: pega um valor x (que é do tipo string e me retorna se
		 * esse x.charAt(0) é igual a M.
		 */

		list.removeIf(x -> x.charAt(0) == 'M');
		System.out.println("Lista sem M:");
		for (String x : list) {
			System.out.println(x); // Alex, Ana, Beatriz
		}
		System.out.println("------------------------------");

		
		/*
		 * Filtrar a lista de quem começa com A transformar a lista para stream (classe
		 * que aceita lambda) filtrar com um predicado O resultado é um stream filtrado
		 * cfe o predicado mas o stream não é compatível com lista, por isso transformar
		 * para lista de novo através do collect(Collectors.toList()).
		 */
		java.util.List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		System.out.println("Lista somente com A:");
		for (String x : result) {
			System.out.println(x); // Alex, Ana
		}
		System.out.println("------------------------------");
		
		
		// Encontrar o primeiro elemento com A:
		String nome = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		String semNome = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println("Encontrar o primeiro elemento com A:");
		System.out.println(nome);
		System.out.println("Encontrar o primeiro elemento com J:");
		System.out.println(semNome);
		System.out.println("------------------------------");
		//Usando optional
		Optional<String> nomeA = list.stream().filter(x -> x.charAt(0) == 'A').findFirst();
		System.out.println(nomeA.get());//se usar optional precisa o get()
	}
}