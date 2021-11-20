package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {

	public static void main(String[] args) {
	
		//Kullanicidan isim ve soyismi ayri ayri isteyip girilen ismi asagidaki gibi yazdiriniz
		
		//girilen isim: Omer Tufan
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz...");
		
		String isim=scan.next();
		
		System.out.println("Lutfen soyisminizi giriniz...");
		
		String soyisim=scan.next();
		
		System.out.println("girilen isim ve soyisim : " + isim + " " + soyisim);

		scan.close();

	}

}
