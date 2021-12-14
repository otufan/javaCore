package day05_matematikselIslemler;

public class C01_MatematikselIslemler {

	public static void main(String[] args) {
		
		System.out.println(4*(2+5)/2); // 14
		
		
		System.out.println(4*(2+5)/3); // butun sayilar int oldugu icin sonucu int olarak veriyor. bu nedenle 9 olarak cikar sonuc
		
		//sonucu virgullu yazdirmak istersek
		
		double sonuc=4*(2+5)/3;
				
		System.out.println(sonuc); //9,0 
		
		sonuc=(double)(4*(2+5)/3);
		
		System.out.println(sonuc); //9,0
		
		sonuc=(double)4*(2+5)/3;
		
		System.out.println(sonuc); //9,3333....

		
		
		int sayi1=5;
		int sayi2=2;
		double sayi3=2;
		
		System.out.println(sayi1/sayi2);//2
		
		System.out.println(sayi1/sayi3);//2,5
	}

}
