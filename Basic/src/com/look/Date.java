package com.look;

import java.time.LocalDate;
import java.time.LocalTime;

public class Date {

	public static void main(String[] args) {
	
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalDate yester = date.minusDays(1);
		System.out.println(yester);
		LocalDate tomrw= date.plusDays(1);
		System.out.println(tomrw);
		LocalDate leap= LocalDate.of(2020, 04, 24);
		System.out.println(leap.isLeapYear());
		
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		LocalTime l = lt.minusHours(2);
		LocalTime lp = l.minusMinutes(30);
		System.out.println(lp);
	}

}
