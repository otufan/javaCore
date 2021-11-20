package day14_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		
		// Kullanicidan iki sayi isteyin
		//Sayilarin karelerini ve kuplerini toplayip yazdiran iki ayri method yazin
		//kullaniciya us sorun
		//2 yazarsa kareleri toplamini yapan method, 3 yazarsa kupler toplamini yapan method calissin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen iki sayi giriniz \nilk sayidan sonra enter a basiniz :");

		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		/*Bir methodu 4 adimda olustururuz
		unutulmamasi gereken axcess modifier ve return type karar vermemiz gerekiyor.
		Methodun yapacagi islevi gerceklestirecek kodlarimizi yazariz
		 */
		
		
	
		System.out.println("Girilen sayilarin kareler toplami icin 2 "
				+ "\nkupler toplamini istiyorsaniz 3 e basin");
		
		int secim=scan.nextInt();
		
		switch (secim ) {
		case 2:
		kareTopla(sayi1, sayi2);
		break;
		case 3:
			kupTopla(sayi1, sayi2);
			break;
		default:
			System.out.println("Lutfen istenen tercihlerden birini yapin");
		}
		
	scan.close();
		
	}

	public static void kupTopla(double sayi1, double sayi2) {
		
		double kuplerToplami=(sayi1*sayi1*sayi1)+(sayi2*sayi2*sayi2);
		
		System.out.println("Girilen sayilarin kuplerinin toplami = " + kuplerToplami);
		
		
		
	}

	public static void kareTopla(double sayi1, double sayi2) {
		// bizim arguman isimlerimizle parametre isimlerimiz ayni olmak zorunda degil. mesela sayi3 veya sayi4 diyebilirdik
		//Java isimlere degil degerlere bakar.
		//bu bir zorunluluk degil imkandir, istedigimizi tercih edebiliriz
		
		double karelerToplami=(sayi1*sayi1)+(sayi2*sayi2);
		
		System.out.println("Kareler toplami = " + karelerToplami);
		
		
		
	}

}
