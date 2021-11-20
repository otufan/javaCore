package day17_forLoop;

import java.util.Scanner;

public class C04_Palindrome {

	public static void main(String[] args) {
		// Soru 9 ) Interview Question Kullanicidan bir String isteyin. Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden bir program yazin.

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen tersten yazdirmak icin bir yazi yazin : ");
		
		String str=scan.nextLine();
		
		if (str.equals(terstenYazdirma(str))) { System.out.println("Girdiginiz kelime palindrome :" +terstenYazdirma(str) );
			
		} else { System.out.println("Girdiginiz kelime palindrome degildir : " + terstenYazdirma(str));

		}
		
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
