package day13_stringManupulations;

import java.util.Scanner;

public class C01_StratsWith_EndsWith {

	public static void main(String[] args) {
		//Kullanicidan bir cumle ve bir kelime alalim
		//Verilen cumlenin verilen kelime ile baslayip, baslamadigini
		//ve bitip bitmedigini yazdiralim
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz:");
		
		String cumle=scan.nextLine();
		
		System.out.println("Lutfen bir kelime giriniz:");
		
		String kelime=scan.next();
		
		if (cumle.endsWith(kelime)) { System.out.println("Cumle girilen kelime ile bitiyor");
			
		} else { System.out.println("Cumle girilen ile bitmiyor!!!");

		}
		
		if (cumle.startsWith(kelime)) { System.out.println("Cumle girilen kelime ile basliyor");
			
		} else { System.out.println("Cumle girilen kelime ile baslamiyor!!!");

		}
		
		scan.close();

	}

}
