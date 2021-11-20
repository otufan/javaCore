package day04_increment_decrement;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz...:");

		String isim=scan.nextLine();
		
		System.out.println("Lutfen soyisminizi giriniz...:");
		
		String soyisim=scan.nextLine();
		
		System.out.println("Isim ve soyisminizin bas harfleri su sekildedir...:" + isim.charAt(0) + " " + soyisim.charAt(0));
		
		scan.close();
		
	}

}
