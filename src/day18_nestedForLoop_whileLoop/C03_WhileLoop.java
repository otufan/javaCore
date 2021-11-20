package day18_nestedForLoop_whileLoop;

public class C03_WhileLoop {

	public static void main(String[] args) {
		//20 den 30 a kadar olan sayilari (30 ve 30 dahil) 
		//While Loop ile yazdirin
		
		for (int i = 20; i <= 30; i++) {
			System.out.print(i + " ");
		}

		System.out.println(" ");
		System.out.println("****** While Loop******");
		
		int sayi=20;
		
		while (sayi<=30) {
			System.out.print(sayi + " ");
			sayi++;
		}
		
		
		//for loop ile cozebilecegimiz sorularda while loop kullanmak
		//kodumuzu biraz uzatir
		
	}

}
