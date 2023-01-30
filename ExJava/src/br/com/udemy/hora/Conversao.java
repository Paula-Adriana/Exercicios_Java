package br.com.udemy.hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Conversao {
	public static void main(String[] args) {
		
		//Global para local = precisa passar o fuso
		
		Instant d07 = Instant.parse("2023-01-23T01:30:26Z");
		
		System.out.println("LocalDate");
		LocalDate r1 = LocalDate.ofInstant(d07, ZoneId.systemDefault());
		System.out.println("r1: "+ r1);//volta para dia 22 - fuso de Londres -3 para SP
		
		LocalDate r2 = LocalDate.ofInstant(d07, ZoneId.of("Portugal"));
		System.out.println("r2: "+ r2);// fuso de Londres +1 para portugal
		
		System.out.println("Local Date Time");
		LocalDateTime r3 = LocalDateTime.ofInstant(d07, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d07, ZoneId.of("Portugal"));
		
		System.out.println("r3: "+ r3);
		System.out.println("r4: "+ r4);
		
		// Extrair dados da hora
		LocalDate d05 = LocalDate.parse("2023-01-23");
		LocalDateTime d06 = LocalDateTime.parse("2023-01-23T01:30:26");
		
		System.out.println("Dia: " + d05.getDayOfMonth());
		System.out.println("Mes: " + d05.getMonth());
		System.out.println("Mes numero: " + d05.getMonthValue());
		System.out.println("Ano: " + d05.getYear());
		System.out.println("Hora: " + d06.getHour());
	}
}
