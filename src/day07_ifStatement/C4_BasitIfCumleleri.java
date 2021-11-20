package day07_ifStatement;

import java.util.Scanner;

public class C4_BasitIfCumleleri {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lutfen dikdortgenin bir kenar uzunlugunu giriniz...:");
		
		double kenar1=scan.nextDouble();
		
		System.out.print("Lutfen dikdortgenin diger kenar uzunlugunu giriniz...:");
		
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			
			System.out.println("Girilen dikdortgen KAREDIR!!!");
		}

		if (kenar1!=kenar2) {
			System.out.println("Girilen dikdortgen KARE DEGILDIR!!!");
		}
	}

}
