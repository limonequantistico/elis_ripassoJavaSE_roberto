package com.azienda.classi.esercizi.arredamento;

public class Main {

	public static void main(String[] args) {

		Stanza s1 = new Stanza("Stanza 1", "Blu", 15.5f, 2.2f);
		
		System.out.println(s1.stampaStanza());
		s1.incrementaMetriQuadri(5);
		System.out.println(s1.stampaStanza());
		
		Tavolo t1 = new Tavolo("Vetro", 1.1f, 3f, 1f, s1);
		Tavolo t2 = new Tavolo("Legno", 2.1f, 5f, 2f, s1);
		
		System.out.println(t1.descrizioneTavolo());
		System.out.println(t2.descrizioneTavolo());
		
	}

}
