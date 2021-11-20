package day18_nestedForLoop_whileLoop;

import java.util.Scanner;

public class C06_WhileLoop {

	public static void main(String[] args) {
		// Kullanicidan toplanmak uzere sayilar isteyin
		//sayi adedi 10'u gecerse veya toplam 500'u gecerse 
		//"Bu kadar sayi yeter"
		//.... adet sayi girdin, toplami... yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen toplanmak uzere sayi giriniz (Bitirmek icin 0 a basiniz) : ");
		
		int toplam=0;
		int sayi=1;
		int adet=0;
		
		do {sayi=scan.nextInt();
		toplam+=sayi;
		if (sayi!=0) {adet++;
			
		}
		
		
		if (toplam>500 || adet>=11) { System.out.println("Bu kadar sayi yeter.");
		
		}
		}
		while (adet<10 && toplam <=500 && sayi!=0);
			
				
		
		
		System.out.println(" ");
		System.out.println("Girilen sayi adeti : " + (adet) + "\nGirilen sayilarin toplami : " +toplam);
		
		scan.close();

	

}
}
