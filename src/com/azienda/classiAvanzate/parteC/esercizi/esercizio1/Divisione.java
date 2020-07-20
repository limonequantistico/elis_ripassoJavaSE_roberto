package com.azienda.classiAvanzate.parteC.esercizi.esercizio1;

public class Divisione implements OperazioniAritmetiche {

	public Integer operate(Integer a, Integer b) {
		if (a == 0 || b == 0) {
			System.out.println("Input non valido, divisione per zero.");
			return null;
		}
		return a / b;
	}

	public void printResult(Integer result) {
		System.out.println("Il risultato della divisione e': " + result);
	}

}
