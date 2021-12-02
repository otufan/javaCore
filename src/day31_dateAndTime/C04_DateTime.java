package day31_dateAndTime;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class C04_DateTime {

	public static void main(String[] args) {
		// bir  String ve bir int variable olusuturalim
		//bir loop icerisinde bu variable lari 1000 kere degistirelim
		//ve islem surelerini kiyaslayalim
		
		
		LocalTime saat1=LocalTime.now();
		
		System.out.println("baslangic saati : " +saat1);
		
		int sayi=10;
		
		for (int i = 0; i < 1000; i++) {

			sayi++;
			
		}
		LocalTime saat2=LocalTime.now();
		System.out.println("bitis saati : " +saat2);
		
		double nano1=saat1.getNano();
		double nano2=saat2.getNano();
		System.out.println("int for loop olusturulma suresi : "+ (nano2-nano1)); //1.89508E7
		
		LocalTime saatStr1=LocalTime.now();
		
		System.out.println("baslangic saati : " +saatStr1);
		
		String str="celil";
		
		for (int i = 0; i < 1000; i++) {

			str+=" ";
			
		}
		LocalTime saatStr2=LocalTime.now();
		System.out.println("bitis saati : " +saatStr2);
		
		double nanoStr1=saatStr1.getNano();
		double nanoStr2=saatStr2.getNano();
		System.out.println("str for loop olusturulma suresi : "+ (nanoStr2-nanoStr1)); //2992500.0
		
		double strSure=nanoStr2-nanoStr1;
		double intSure=nano2-nano1;
		
		System.out.println(strSure-intSure);
	}

}
