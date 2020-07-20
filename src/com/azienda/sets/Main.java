package com.azienda.sets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
	
	final static String ESC = "ESC";

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String stringaUtente = "";
		
		Set<String> set = new HashSet<String>();
		
		try {
			do {
				System.out.println("Inserire una stringa (digitare 'esc' per terminare):");
				stringaUtente = input.nextLine();
				set.add(stringaUtente);
				
			} while (!stringaUtente.equalsIgnoreCase(ESC));

			set.remove("esc");
			Main.printSet(set);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			input.close();
		}
	}
	
	public static void printSet(Set<String> set){
		System.out.println(set.toString());
	}

}
