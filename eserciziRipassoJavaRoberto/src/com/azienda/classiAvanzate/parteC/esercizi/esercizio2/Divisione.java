package com.azienda.classiAvanzate.parteC.esercizi.esercizio2;

public class Divisione extends AstrattaOperazioni {

	@Override
	public Integer operate(Integer a, Integer b) {
		if (a == 0 || b == 0) {
			System.out.println("Input non valido, divisione per zero.");
			return null;
		}
		return a / b;
	}

}
