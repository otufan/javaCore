package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_Modulus {

	public static void main(String[] args) {
		
		
		//kullanicidan 3 basamakli bir sayi alip rakamlar toplamini yazdiran bir program yaziniz
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen 3 basamakli bir sayi giriniz");
		
		int sayi=scan.nextInt();
		
		//sayi 573 olsun
		
		int rakamlarToplami=0;
		
		int rakam=sayi%10; //bana birler basamigini verir rakam=3
		
		rakamlarToplami+=rakam;  //rakamalar toplami 3 oldu
		
		//sayi hala degismedi 573
		// 3 ten kurtulmak istiyorum cunku isim bitti
		
		sayi/=10; //sayim artik 57
		
		rakam=sayi%10;
		
		rakamlarToplami+=rakam;
		
		//sayi hala 57
		// 7 den de kurtulalim
		
		sayi/=10;
		
		rakamlarToplami+=sayi;
		
		System.out.println("Girilen sayinin rakamlar toplami...:" + rakamlarToplami);
		
		scan.close();

	}

}
