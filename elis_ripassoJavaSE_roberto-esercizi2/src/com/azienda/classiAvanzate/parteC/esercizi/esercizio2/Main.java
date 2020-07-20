package com.azienda.classiAvanzate.parteC.esercizi.esercizio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int scelta = 0;
		Scanner input = new Scanner(System.in);
		AstrattaOperazioni obj;

		try {
			do {
				System.out.println("Esercizio 2");
				System.out.println("1. somma");
				System.out.println("2. differenza");
				System.out.println("3. prodotto");
				System.out.println("4. divisione");
				System.out.println("5. esci");

				scelta = input.nextInt();

				if (scelta != 5) {
					System.out.println("Inserire il primo numero:");
					int x = input.nextInt();
					System.out.println("Inserire il secondo numero:");
					int y = input.nextInt();

					switch (scelta) {
					case 1:
						obj = new Somma();
						obj.printResult(obj.operate(x, y));
						break;

					case 2:
						obj = new Differenza();
						obj.printResult(obj.operate(x, y));
						break;
					case 3:
						obj = new Prodotto();
						obj.printResult(obj.operate(x, y));
						break;
					case 4:
						obj = new Divisione();
						obj.printResult(obj.operate(x, y));
						break;

					default:
						throw new IllegalArgumentException("Unexpected value: " + scelta);
					}
				}

			} while (scelta != 5);

			System.out.println("Programma terminato.");
		} catch (InputMismatchException e) {
			System.out.println("Inserire un valore valido.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			input.close();
		}
	}

}
