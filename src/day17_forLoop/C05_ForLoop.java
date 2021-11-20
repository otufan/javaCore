package day17_forLoop;

import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
		//Soru 10 ) Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari toplayip, sonucu yazdiran bir program yaziniz

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen sirayla iki sayi giriniz : ");
		
		int num1=scan.nextInt();
		
		int num2=scan.nextInt();
		
		
		int kucuk;
		int buyuk;
		
		if (num1>num2) { buyuk=num1;
						 kucuk=num2;
			
		} else {   buyuk=num2;
				   kucuk=num1;

		}
		
		int toplam=0;
		
		for (int i = kucuk; i <= buyuk; i++) { toplam+=i;
			
		}
		
		System.out.println("Girilen sayilar ve aralarindaki sayilarin toplami : " + toplam);
		scan.close();
	}

}
