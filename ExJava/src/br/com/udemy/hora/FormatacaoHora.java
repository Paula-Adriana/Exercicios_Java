package br.com.udemy.hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormatacaoHora {

	// ISO 8601 - padrão java = yyyy-mm-dd
	//
	// Data/hora para texto
	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d05 = LocalDate.parse("2023-01-23");
		
		//Formas para imprimir
		System.out.println("LocalDate");
		System.out.println("d05: " + d05.format(fmt1));
		System.out.println("d05: " + fmt1.format(d05));
		System.out.println("d05: " + d05.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println();
		
		LocalDateTime d06 = LocalDateTime.parse("2023-01-23T01:30:26");
		
		System.out.println("LocalDateTime");
		System.out.println("d06: " + d06.format(fmt2));
		System.out.println();
		
		//Instant não possui método format -  o dia/mes etc 
		//depende do fuso horário - passar o fuso para customização
		Instant d07 = Instant.parse("2023-01-23T01:30:26Z");
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
				.withZone(ZoneId.systemDefault()); //considera o fuso do pc
		System.out.println("Instant");
		System.out.println("d07: " + fmt3.format(d07));

	}

}
