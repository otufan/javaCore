package day17_forLoop;

import java.util.Scanner;

public class C03_ForLoopMethod {

	public static void main(String[] args) {
		// Soru 8 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersine ceviren bir method yazin.

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir kelime giriniz : ");
		
		String str=scan.nextLine();
		
		System.out.println(terstenYazdirma(str));
		
		scan.close();
		
	}

	public static String terstenYazdirma(String str) {
		
		
		String kelime="";
		
		for (int i = str.length()-1; i >= 0; i--) {
			
		kelime+=str.substring(i, i+1);
			
		}
		
		
		return kelime ;
		
	}

}
