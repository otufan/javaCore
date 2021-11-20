package day12_stringManupilation;

import java.util.Scanner;

public class C03_LastIndexOf {

	public static void main(String[] args) {
		
		//Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup olmadigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle yaziniz:");
		
		String cumle=scan.nextLine();
		
		System.out.println("Lutfen bir harf giriniz:");
		
		char karakter=scan.next().charAt(0);
		
		int index=cumle.indexOf(karakter);
		
		if (cumle.lastIndexOf(karakter)<0) {System.out.println("Girilen karakter cumlede yer almamaktadir!!!");
			
		} else { System.out.println("Girilen karakter cumlede yer almaktadir, indexi:" + index);

		}
		
		scan.close();

	}

}
