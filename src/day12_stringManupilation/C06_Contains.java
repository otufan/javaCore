package day12_stringManupilation;

import java.util.Scanner;

public class C06_Contains {

	public static void main(String[] args) {
		
		/*Soru 1) Kullanicidan email adresini girmesini isteyin, mail @gmail.com icermiyorsa “lutfen gmail adresi giriniz”,
		 *  @gmail.com ile bitiyorsa “Email adresiniz kaydedildi “ , @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen mail adresinizi giriniz:");
		
		String eMail=scan.next();
		
		int uzunluk=eMail.length();
		
		int index=eMail.lastIndexOf("@gmail.com");
		
		
		if (!eMail.contains("@gmail.com")) //Burada basina unlem isareti koyarak ICERMIYORSA diye cevirmis olduk!!! ONEMLI
		
		{ System.out.println("Lutfen gmail adresi giriniz!!!");
			
		} else if (index==uzunluk-10){ System.out.println("Email adresiniz kaydedildi");

		}
		else { System.out.println("Lutfen yazimi kontrol ediniz!");
			
		}
		scan.close();
	}

}
