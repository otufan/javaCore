package day09_nestedIfElse;

public class C03_Ternary {

	public static void main(String[] args) {
		
		int x=10;
		
		 String tekMiCiftMi = x%2==0 ? "cift sayi" : "tek sayi";
		
		 System.out.println(tekMiCiftMi); //if clauslarindan daha basit kullanimlar icin kullaniliyor. 
		 								// ama sonucu yazdirabilmemiz icin bir variable atamamiz gerekiyor

		 //kisa olarakta yazdirilabilir variable atama yapilmadan direkt olarak syso icinde kullanilabilir...
		 
		 
		 System.out.println(x%2==0 ? "cift sayi" : "tek sayi");
		 
		// x>5 ? "Aferin" : 4 ;
		 
		 System.out.println(x>5 ? "Aferin" : 4);
		 
		 //eger ternary de donecek sonuclar ayni data turunden degilse
		 //atama yapamiz, sadece syso ile yazdirabiliriz...
		 
		 
		 
	}

}
