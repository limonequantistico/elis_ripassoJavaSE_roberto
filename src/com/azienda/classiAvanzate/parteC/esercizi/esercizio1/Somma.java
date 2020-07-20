package com.azienda.classiAvanzate.parteC.esercizi.esercizio1;

public class Somma implements OperazioniAritmetiche {

	public Integer operate(Integer a, Integer b) {
		return a + b;
	}

	public void printResult(Integer result) {
		System.out.println("Il risultato della somma e': " + result);
	}

}
