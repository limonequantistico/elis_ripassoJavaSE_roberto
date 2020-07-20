package com.azienda.liste;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	final static String ESC = "ESC";

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String stringaUtente = "";
		List<String> lista = new ArrayList<String>();

		try {
			do {
				System.out.println("Inserire una stringa (digitare 'esc' per terminare):");
				stringaUtente = input.nextLine();
				lista.add(stringaUtente);
			} while (!stringaUtente.equalsIgnoreCase(ESC));

			lista.remove(lista.size() - 1);
			Main.printList1(lista);
			Main.printList2(lista);
			Main.printList3(lista);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			input.close();
		}

	}

	public static void printList1(List<String> lista) {
		System.out.println("---------------------");
		System.out.println("printList1:");
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		System.out.println("---------------------");
	}

	public static void printList2(List<String> lista) {
		System.out.println("---------------------");
		System.out.println("printList2:");
		
		for (String elemento : lista) {
			System.out.println(elemento);
		}
		System.out.println("---------------------");
	}

	public static void printList3(List<String> lista) {
		System.out.println("---------------------");
		System.out.println("printList3:");

		Iterator<String> iterator = lista.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("---------------------");
	}

}
