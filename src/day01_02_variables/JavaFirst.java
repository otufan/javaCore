package day01_02_variables;

import java.time.LocalTime;

public class JavaFirst {
	
	public static void main(String[] args) {
		
	LocalTime zeit=LocalTime.now();
	LocalTime morgen=LocalTime.parse("09:00:00");
	LocalTime feierAbend=LocalTime.parse("15:00:00");
	
	if (zeit.isBefore(morgen)) {
		System.out.println("Guten Morgen");
	} else if (zeit.isAfter(feierAbend)) {
		System.out.println("Schönen FA");
	} else {
		System.out.println("Ich bin da:)");
	}
	
	}
}
