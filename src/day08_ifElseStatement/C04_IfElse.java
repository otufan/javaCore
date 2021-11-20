package day08_ifElseStatement;

import java.util.Scanner;

public class C04_IfElse {

	public static void main(String[] args) {
		
		//Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu 
		//birbirine esit ise ekrana “Eskenar ucgen” yazdirin. Diger durumlarda ekrana “Eskenar degil” yazdirin.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lutfen ucgenin ilk kenar uzunlugunu giriniz:");
		
		double a=scan.nextDouble();
		
		System.out.print("Lutfen ucgenin ikinci kenar uzunlugunu giriniz:");
		
		double b=scan.nextDouble();
		
		System.out.print("Lutfen ucgenin ucuncu kenar uzunlugunu giriniz:");
		
		double c=scan.nextDouble();
		
		if (a==b && a==c) {
			System.out.println("Girilen ucgen ESKENAR ucgendir!!!");
			
		} else {
			
			System.out.println("Girilen ucgen ESKENAR ucgen DEGILDIR!!!");

		}
		
		scan.close();
	}

}
