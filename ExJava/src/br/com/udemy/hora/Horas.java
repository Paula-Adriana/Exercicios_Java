package br.com.udemy.hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Horas {
	
	public static void main(String[] args) {
		
		//Objetos imutáveis
		//Hora agora
		LocalDate d02 = LocalDate.now();
		LocalDateTime d03 = LocalDateTime.now();
		Instant d04 = Instant.now();
		
		System.out.println("d02: " + d02);
		System.out.println("d03: " + d03);
		System.out.println("d04: " + d04); //Z = horario de Londres(GMT)
		
		//Texto em hora
		LocalDate d05 = LocalDate.parse("2023-01-23");
		LocalDateTime d06 = LocalDateTime.parse("2023-01-23T01:30:26");
		Instant d07 = Instant.parse("2023-01-23T01:30:26Z");
		
		System.out.println("d05: " + d05);
		System.out.println("d06: " + d06);
		System.out.println("d07: " + d07);
		
		//especificando um timezone
		Instant d08 = Instant.parse("2023-01-23T01:30:26-03:00");
		System.out.println("d08: " + d08);
		
		//Formato customizado
		LocalDate d09 = LocalDate.parse("20/07/2023", DateTimeFormatter.ofPattern("dd/MM/yyy"));
		System.out.println("d09: " + d09);
		
		LocalDateTime d10 = LocalDateTime.parse("20/07/2023 01:30", DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm"));
		System.out.println("d10: " + d10);
		
		//Ano, mes, dia
		LocalDate d11 = LocalDate.of(2023, 1, 23);
		System.out.println("d11: " + d11);
		
		//com horario
		LocalDateTime d12 = LocalDateTime.of(2023, 1, 23, 1, 30);
		System.out.println("d12: " + d12);
	}
}
