package day15_methodCreation;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {
		
		//kullanicidan iki ismini ve soyisimini isteyin
		//iki farkli method olusturun. 
		//Methodlardan biri ilk harf buyuk, digerleri kucuk olacak sekilde girilen kelimeleri birlestirsin
		//Ikinci method isim ve soyimin ilk harfleri buyuk harf, kalan harfler * olacak sekilde birlestirilsin
		
		//kullaniciya isminin acik olarak yazilmasi veya gizlenmesi tercihini sorun
		//ve programin kalan kisminda isim ve soyismi kullanicinin istedigi sekilde kullanin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lutfen isminizi giriniz    : ");
		
		String isim=scan.next();
		
		System.out.print("Lutfen soyisminizi giriniz :");
		
		String soyisim=scan.next();
		
		System.out.print("Isminizin acik olarak yazilmasini istiyorsaniz 1, isminizi gizlenmesini istiyorsaniz 2 yi tuslayiniz:");
		
		int tercih=scan.nextInt();
		
		String birlesmisIsim = null; // Adem Saglam, A*** S*****
		
		
		if (tercih<1||tercih>2) { System.out.println("Lutfen tercihinizi 1 veya 2 seklinde yapiniz!");
			
		} else  if (tercih==1){ birlesmisIsim=acikIsim(isim, soyisim);

		}
		else { birlesmisIsim=isimGizle(isim, soyisim);
			
		}
		
		
		//Bu satirdan itibaren kullanicinin isim ve soyismi kullanici tercihine bagli olarak kaydedildi. 
		
		if (tercih==1||tercih==2) {System.out.println("Kullanicinin trercihi : " + birlesmisIsim);
			
		} 
		
		
		scan.close();
		
	}

	public static String isimGizle(String isim, String soyisim) {
		
		isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w", "*");
		soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w", "*");
		
		return isim+ " " + soyisim;
	}

	public static String acikIsim(String isim, String soyisim) {
		
		isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
		soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();
		
		
		return isim+" "+soyisim;
		
		
		
	}

}
