package com.azienda.classiAvanzate.parteC.esercizi.esercizio1;

public class Differenza implements OperazioniAritmetiche {

	@Override
	public Integer operate(Integer a, Integer b) {
		return a - b;
	}

	@Override
	public void printResult(Integer result) {
		System.out.println("Il risultato della sottrazione e': " + result);
	}

}
