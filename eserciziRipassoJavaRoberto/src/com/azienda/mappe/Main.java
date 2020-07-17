package com.azienda.mappe;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	final static String CIAO = "ciao_";

	public static void main(String[] args) {

		Map<Integer, String> mappa = new HashMap<Integer, String>();
		Scanner input = new Scanner(System.in);

		System.out.println("Inserire un numero:");
		int x = input.nextInt();

		for (int i = 1; i <= x; i++) {
			mappa.put(i, CIAO + i);
		}

		Main.printMap(mappa);

	}

	public static void printMap(Map<Integer, String> mappa) {
		for (Integer key : mappa.keySet()) {
			System.out.println(mappa.get(key));
		}
	}

}
