package day12_stringManupilation;

import java.util.Scanner;

public class C04_LastIndexOf {

	public static void main(String[] args) {
		
		/*Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
		 - Girilen kelime cumlede kullanilmamis.
		 - Girilen kelime cumlede 1 kere kullanilmis.
		 - Girilen kelime cumlede 1’den fazla kullanilmis.
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz:");
		
		String cumle=scan.nextLine();
		
		System.out.println("Lutfen bir kelime giriniz:");
		
		String kelime=scan.next();
		
		int index=cumle.lastIndexOf(kelime);
		
		if (index<0) { System.out.println("Girilen karakter cumlede yer almamaktadir!");
			
		} else { if ((cumle.lastIndexOf(kelime, index-1))<0) { System.out.println("Girilen kelime cumlede sadece 1 kere kullanilmistir!");
			
		} else { System.out.println("Girilen kelime cumlede birden fazla kullanilmistir!");

		}

		}
		
		scan.close();
	}

}
