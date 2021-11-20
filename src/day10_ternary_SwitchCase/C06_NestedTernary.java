package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C06_NestedTernary {

	public static void main(String[] args) {
		
		// Soru2 : Kullanicidan bir harf isteyin
				// kucuk harf ise consola “Kucuk Harf” ,
				// buyuk harfse consola “Buyuk Harf”
				// yoksa “girdiginiz karakter harf degil” yazdirin.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir harf giriniz ");
		
		char harf=scan.next().charAt(0);
		
		String sonuc=(harf>='a' && harf<='z') ? "Kucuk Harf" : (harf>='A' && harf<='Z' ? "Buyuk Harf" : "Girdiginiz karakter harf degil");

		System.out.println(sonuc);
		
		scan.close();
	}

}
