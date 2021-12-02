package day31_dateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {

	public static void main(String[] args) {
		
		
		LocalTime saat1=LocalTime.now();
		
		System.out.println("baslangic saati : " +saat1);//21:03:26.706493700
		
		int sayi=10;
		
		for (int i = 0; i < 1000000000; i++) {

			sayi++;
			
		}
		LocalTime saat2=LocalTime.now();
		System.out.println("bitis saati : " +saat2);
		
		double nano1=saat1.getNano();
		double nano2=saat2.getNano();
		System.out.println("for loop olusturulma suresi : "+ (nano2-nano1));
		
		System.out.println(saat1.getMinute());//28
		System.out.println(saat1.plusMinutes(1000));//14:11:12.111981300
		System.out.println(saat1.minusHours(20));//01:31:42.835026
		
		
		LocalTime yerelSaat=LocalTime.now(ZoneId.of("Japan"));
		
		System.out.println(yerelSaat);//05:36:16.564358800
		
	}

}
