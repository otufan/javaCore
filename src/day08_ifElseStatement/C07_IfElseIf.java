package day08_ifElseStatement;

import java.util.Scanner;

public class C07_IfElseIf {

	public static void main(String[] args) {
	
		
		//Soru 8) Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap azdirin. Teklif 80.000’in uzerinde ise “Kabul ediyorum” ,
	// 60 – 80.000 arasinda ise “Konusabiliriz”,
	 //60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen maas teklifini giriniz:");
		
		double maas=scan.nextDouble();
		
		if (maas<60000) {
			System.out.println("Malesef kabul edemem!!!");
			
		} else if(maas<80000) {
			System.out.println("Konusabiliriz");

		}
		else {
			System.out.println("Kabul ediyorum!!!");
		}
	
	scan.close();
	}

}
