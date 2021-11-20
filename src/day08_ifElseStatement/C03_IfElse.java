package day08_ifElseStatement;

import java.util.Scanner;

public class C03_IfElse {

	public static void main(String[] args) {
		
		
		//Soru 3) Kullaniciya yasini sorun, eger yas 65’den kucuk ise “emekli olamazsin, calismalisin”, 65 e veya buyukse buyukse “Emekli olabilirsin” yazdirin

		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lutfen yasinizi giriniz:");
		
		int yas=scan.nextInt();
		
		if (yas>=65) {
			System.out.println("Yasin " + yas +  " oldugu icin EMEKLI OLABILIRSIN!!!");
			
		} else {
			System.out.println("Yasin " + yas + " oldugu icin EMEKLI OLAMAZSIN, CALISMALISIN!!!");

		}
		
		scan.close();
	}

}
