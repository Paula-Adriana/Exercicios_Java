package br.com.udemy;

public class FuncoesString {
	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG ";
		
		//Substring - gera nova str a partir do index 5
		String s01 = original.substring(2);
		System.out.println(s01); //cde FGHIJ ABC abc DEFG 
		
		//recorta a string a partir do 5 até o index 9
		String s02 = original.substring(2, 9);
		System.out.println(s02); //cde FGH
		
		//Replace
		String s03 = original.replace('a', 'Z');
		System.out.println(s03);
		
		//Replace na substring
		String s04 = original.replace("abc", "ZZ");
		System.out.println(s04);
		
		//indexOf
		int posicao = original.indexOf("bc");
		System.out.println(posicao);//1
		
		int posicaoLastOf = original.lastIndexOf("bc");
		System.out.println(posicaoLastOf);//17
		
		
	}
}
