package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {

	public static void main(String[] args) {
		
		//Scanner isleminde string icin iki metod vardir. 
		//scan.next dedigimizde sadece bir kelime alir (ilk space' e kadar
		//eger kullanicidan daha fazla kelime gelme ihitimali varsa 
		//scan.nextLine() kullanmaliyiz.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz...");
		
		String isim=scan.nextLine();
		
		System.out.println("Lutfen soyisminizi giriniz...");
		
		String soyisim=scan.nextLine();
		
		System.out.println("girilen isim ve soyisim : " + isim + " " + soyisim);
		scan.close();

	}

}
