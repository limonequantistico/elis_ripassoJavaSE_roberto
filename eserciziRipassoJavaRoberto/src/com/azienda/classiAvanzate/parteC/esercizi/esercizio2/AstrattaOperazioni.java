package com.azienda.classiAvanzate.parteC.esercizi.esercizio2;

import com.azienda.classiAvanzate.parteC.esercizi.esercizio1.OperazioniAritmetiche;

public abstract class AstrattaOperazioni implements OperazioniAritmetiche {
	
	@Override
	public void printResult(Integer result) {
		System.out.println("Il risultato e': " + result);
	}

}
