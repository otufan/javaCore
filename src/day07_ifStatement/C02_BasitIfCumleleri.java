package day07_ifStatement;

import java.util.Scanner;

public class C02_BasitIfCumleleri {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lutfen bir tam sayi giriniz...:");
		
		int sayi=scan.nextInt();
		
		if (sayi%2==0) {
			System.out.println("Girilen sayi cift sayidir");
		}
				
		if (sayi%2==1) {
			System.out.println("Girilen sayi tek sayidir");
		}	

		
		
		
		
		
	}

}
