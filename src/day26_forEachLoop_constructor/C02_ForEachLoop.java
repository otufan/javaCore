package day26_forEachLoop_constructor;

public class C02_ForEachLoop {

	public static void main(String[] args) {
		// Bir integer array olusturunuz ve bu array deki tum sayilarin carpimini for each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz
		
		int arr[]= {1,2,3, 4};
		int toplam=1;
		for(int each:arr) {
			
			toplam*=each;
			
		}
		
		System.out.println("Array icinde bulunan sayilarin carpiminin sonucu " + toplam + " olarak hesaplanmistir.");

	}

}
