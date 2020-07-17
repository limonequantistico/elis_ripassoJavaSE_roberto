package com.azienda.arrayBidimensionali;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Inserire un numero:");
		Integer x = input.nextInt();

		int array[][] = new int[x][x];

		Main.stampaArray(Main.riempiArray(array));
	}

	public static int[][] riempiArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i == j) {
					array[i][j] = 1;
				} else {
					array[i][j] = 0;
				}
			}
		}
		return array;
	}

	public static void stampaArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
//				System.out.print("[" + i + "]" + "[" + j + "]" + " | ");
				System.out.print(array[i][j] + "|");
			}
			System.out.println();
		}
	}

}
