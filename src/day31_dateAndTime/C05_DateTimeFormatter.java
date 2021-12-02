package day31_dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {

	public static void main(String[] args) {
		
		
		LocalDateTime tarihSaat=LocalDateTime.now();
		
		System.out.println(tarihSaat);//2021-12-02T21:44:33.156621600

		
		//Eger tarih veya saati kemdi istedigimiz sekilde yazdirmak istersek
		//gun  / ay / yil saat:dakika
		
		DateTimeFormatter duzenle=DateTimeFormatter.ofPattern("dd / MM / YYYY EEE HH : mm");
		
		System.out.println(duzenle.format(tarihSaat)); //02 / 12 / 2021 Do. 21 : 55
		
		/*
		 format olustururken 
		 
		 GUN
		 
		 d    : basta sifir varsa onu yazmadan gun numarasini yazar
		 dd   : tek haneli gunleri 01 gibi basina 0 yazarak gun numarasini verir
		 DDD  : yilin kacinci gunu oldugunu yazar
	 E/EE/EEE : gun isminin ilk 3 harfi
		 EEEE : gun isminin tamamini verir
		 
		 AY (Ay icin M, dakika icin m kullanilir)
		 
		 M   : basta sifir varsa onnu yazmadan ay numarasi
		 MM  : tek haneli aylari 01 gibi basina 0 yazarak ay numarasi 
		 MMM :Ay isminin ilk 3 harfi
		 MMMM:Ay isminin tamami
		 
		 YIL
		 
		 YY  : Yilin son iki rakamini
		 YYYY: Yilin tamamini
		
		 Saat: (24 saaat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)
		 
		 HH  : saatin tamami, tek rakamli saat olursa 02 gibi
		 H   : tek rakamli saat olursa sadece saati
		 
		 a yazarsak AM veya PM degerini  yazar
	
		 
		 */
		

	}

}
