package day05_matematikselIslemler;

import java.util.Scanner;

public class C04_Modulus {

	public static void main(String[] args) {
		
		//Kullanicidan 4 basamakli bir sayi alip rakamlar toplamini yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen 4 basamakli bir sayi giriniz");
		
		int sayi=scan.nextInt();
		
		
		int rakamlarToplami=0;
		int rakam=sayi%10;
		rakamlarToplami+=rakam; 
		sayi/=10; 
		
		
		rakam=sayi%10;
		rakamlarToplami+=rakam; 
		sayi/=10; 
		
		
		rakam=sayi%10;
		rakamlarToplami+=rakam; 
		sayi/=10; 
		
		
		rakam=sayi%10;
		rakamlarToplami+=rakam; 
		sayi/=10; 
		
		//bu islemi basamak sayisi kadar tekrar edersek rakamlar toplamini buluruz
		
		System.out.println("Girilen sayinin rakamlar toplami...:" + rakamlarToplami);
		
		
	}

}
