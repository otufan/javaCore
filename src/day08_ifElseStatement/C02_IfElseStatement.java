package day08_ifElseStatement;

import java.util.Scanner;

public class C02_IfElseStatement {

	public static void main(String[] args) {


		//Soru 2) Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdirin

		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lutfen bir karakter giriniz...:");
		
		char karakter=scan.next().charAt(0);
		
		if ((karakter>='A' && karakter<='Z') || (karakter>='a' && karakter<='z')) {
			System.out.println("Girilen karakter " + karakter +  " HARFTIR ");
			
		} else { System.out.println("Girilen karakter " + karakter +  " HARF DEGILDIR!!!");

		}
		
		scan.close();
	}

}
