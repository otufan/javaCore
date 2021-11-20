package day18_nestedForLoop_whileLoop;


import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {
		
		//Kullanicadan toplanmak uzere sayi isteyin
		//kullanici sifira basincaya kadar sayilari alip toplamaya devam edin
		//kullanici sifira bastiginda,
		//o ana kadar kac sayi girdigini ver girilen sayilarin toplamini yazdirin
		
		
		//kullanicidan 5 sayi alin dese
		
		for (int i = 1; i < 5; i++) {
			
			//kullanicidan bir deger alip, toplama eklerim
			
		}
		
		
		Scanner scan=new Scanner(System.in);
		//loop un icinde kullanacagim obje ve variable'lari
		//llop dan once olusturmak daha guzeldir
		//cunku loop un icinde olusturursak
		//loop her dondugunde yeni bir obje veya variable olusturur ve bu da hafizayi doldurur
		
		int sayi=10; //bu soru ozelinde 0 veremeyiz. cunku kullanici sifir girerse olay biyitor  
		int toplam=0;
		int sayac=0;
		
		
		while (sayi!=0) {
			
			System.out.print("Lutfen toplama eklemek icin bir tam sayi yazin \nbitermek icin 0' a basiniz : ");
			sayi=scan.nextInt();
			toplam+=sayi;
			sayac++;
			
			
		}
		
		
		//kullanici 0' a bastiginda loop islemini son kez yapip 
		//sonra basa donecek ve loop bitecek
		
		System.out.println("Girilen sayi adeti : " + (sayac-1));
		System.out.println("Girilen sayilarin toplami : " + toplam);
		
		
		scan.close();
		
	}

}
