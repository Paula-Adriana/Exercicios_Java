package br.com.udemy.hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalculoComDataHora {

	//Usar a sobrecarga dos m�todos  
	public static void main(String[] args) {
		
		LocalDate d02 = LocalDate.now();
		Instant d04 = Instant.now();
		
		//Semana passada
		LocalDate pastWeekDate = d02.minusDays(7);
		LocalDate nextWeekDate = d02.plusDays(7);
		
		System.out.println("Semana passada: " + pastWeekDate);
		System.out.println("Pr�xima semana: " + nextWeekDate);
		
		//temporal unit - ChronoUnit
		Instant pastWeekInstant = d04.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d04.plus(7, ChronoUnit.DAYS);
		System.out.println("Semana passada: " + pastWeekInstant);
		System.out.println("Pr�xima semana: " + nextWeekInstant);
		
		
		//Dura��o com localDate nao tem tempo entao converter para localTime 
		//usando atTime
		Duration t1 = Duration.between(pastWeekDate.atTime(0,0), d02.atTime(0,0));
		System.out.println("Dura��o atTime: " + t1.toDays());
		
		//usando atStartOfDay()
		Duration t2 = Duration.between(pastWeekDate.atStartOfDay(), d02.atStartOfDay());
		System.out.println("Dura��o atStartOfDay(): " + t1.toDays());
	}

}
