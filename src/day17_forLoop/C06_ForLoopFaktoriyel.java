package day17_forLoop;

import java.util.Scanner;

public class C06_ForLoopFaktoriyel {

	public static void main(String[] args) {
		// Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen 10' dan kucuk bir tam sayi giriniz: ");
		
		int sayi=scan.nextInt();
		System.out.print(sayi+"!=");
		int toplam=1;
		
		for (int i = sayi; i >1 ; i--) { toplam*=i;
			System.out.print(i + "*");
		}
		
		System.out.print("1=" + toplam);
		scan.close();
	}

}
