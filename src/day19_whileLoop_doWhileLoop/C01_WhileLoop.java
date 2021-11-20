package day19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {

	public static void main(String[] args) {
		
		//Soru 6 ) Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lutfen bir sayi giriniz : ");
		
		int sayi=scan.nextInt();
		
		int a=1;
		int adet=0;
		
		while (a<=sayi) { 
		
		if (sayi%a==0) { System.out.print( a+ " "); adet++;
			
		}
		a++;	
		}
		System.out.println("");
		System.out.println("Toplam " + adet + " tam bolen sayi vardir.");
		scan.close();
	}

}
