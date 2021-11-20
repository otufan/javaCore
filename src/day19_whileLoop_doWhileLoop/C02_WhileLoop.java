package day19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {

	public static void main(String[] args) {
		// Soru 7 ) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lutfen bir sayi giriniz : ");
		
		int sayi=scan.nextInt();
		
		int toplam=0;
		int rakam=0;
		
	/*	while (sayi>0) {
			rakam=sayi%10;
			toplam+=rakam;
			sayi/=10;
			
		}
		System.out.println("Girilen sayinin rakamlar toplami : " + toplam);*/
		
		
		//int olarak verilen bir sayinin basamak sayisini bulmak istersek kisa yoldan o sayiyi String cevirip, str.length() methodunu kullanabiliriz...
		int toplam1=0;
				
	    for (int i = sayi; i >= 1; i/=10) {
			
			toplam1+=(i%10);
			
		
			}

	    System.out.println(toplam1);
	    scan.close();
	}

}
