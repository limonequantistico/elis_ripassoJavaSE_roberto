package com.azienda.arrayMonodimensionali;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Digitare la dimensione dell'array: ");
		Integer x = input.nextInt();

		int[] array = new int[x];

		Main.stampaArray(Main.riempiArray(array));
		input.close();

	}

	public static int[] riempiArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = i * i;
		}
		return array;
	}

	public static void stampaArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
