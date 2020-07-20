package com.azienda.classi.esercizi.banca;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Indirizzo i1 = new Indirizzo("Milano", "Via Verdi", 12);
		System.out.println(i1.descrizione());

		Banca b1 = new Banca("Banca Intesa", i1);
		System.out.println(b1.descrizione());

		ContoCorrente cc1 = new ContoCorrente("12345", 1500, b1);
		System.out.println(cc1.descrizione());
		ContoCorrente cc2 = new ContoCorrente("56789", 5000, b1);
		System.out.println(cc1.descrizione());

		System.out.println(cc1.getBanca().getNome());
		System.out.println(cc1.getCittaBanca());
		System.out.println(cc2.getBanca().getNome());
		System.out.println(cc2.getCittaBanca());

		System.out.println("Inserire importo:");
		Scanner input = new Scanner(System.in);
		float importo = 0;
		try {
			importo = input.nextFloat();
		} catch (InputMismatchException e) {
			System.out.println("Inserire un valore valido.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		cc1.setSaldo(cc1.getSaldo() + importo);
		System.out.println(cc1.descrizione());
		cc2.setSaldo(cc2.getSaldo() - importo);
		System.out.println(cc2.descrizione());
		
		input.close();
	}

}
