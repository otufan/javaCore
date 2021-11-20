package day07_ifStatement;

import java.util.Scanner;

public class C01_BasitIfCumleleri {

	public static void main(String[] args) {
	
		
		/*
         * Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin 
         * ve o harfle baslayan gun isimlerini yazdirin 
            Ornek:  ilkHarf=P output = “Pazar, Pazartesi veya Persembe”             
            ilkHarf=S output = “Sali”
            
         *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
         */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lutfen sectiginiz gunun ilk harfini giriniz...:");
		//or kapisi ile kucuk harf problemi cozulebilir ama uzun yol
		//Kullanicinin girdigi verinin tamamini kucuk harf veya buyuk harf yazabiliriz
		//scan.next() sonra toUpperCase yazarsak kelimeyi buyuk harfe
		//toLowerCase yazarsak kelimenin tamamini kucuk harfa cevirmis oluruz
		
		
		char harf=scan.next().toUpperCase().charAt(0);
		
	
		if (harf=='P') {							
			System.out.println("Pazartesi, Persembe, Pazar");
		}
		
		if (harf=='S') {
			System.out.println("Sali");
		}
	
		if (harf=='C') {
			System.out.println("Carsamba, Cuma, Cumartesi");
		}
	
		if (harf!='C'&& harf!='S' && harf!='P') {
			System.out.println("Gecersiz harf girdiniz!!!Lutfen gecerli bir gunun basharfini giriniz");
		}
		
	}

}
