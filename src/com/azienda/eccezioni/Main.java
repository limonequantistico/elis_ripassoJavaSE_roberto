package com.azienda.eccezioni;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Inserire il primo numero: ");
		int x = input.nextInt();

		if (x < 0) {
			throw new RuntimeException("Valore inserito negativo.");
		}
		
		System.out.println("Inserire il secondo numero: ");
		int y = input.nextInt();
		
		if (y == 0) {
			throw new RuntimeException("Valore inserito uguale a 0.");
		}
		
		System.out.println(x + " / " + y + " = " + x / y);

	}

}
