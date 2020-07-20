package com.azienda.date;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		
		LocalDateTime aDateTime = LocalDateTime.of(2020, Month.JANUARY, 01, 12, 30);
		System.out.println(aDateTime.format(formatter));


		LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(formatter));
		

	}

}
