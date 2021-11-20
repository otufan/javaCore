package day19_whileLoop_doWhileLoop;

public class C04_DoWhileLoop {

	public static void main(String[] args) {
		// Soru 2 ) ’m’ harfinden baslayarak ‘c’ harfine kadar tum harfleri yazdirin.

		
		
		for (char i = 'm' ; i > 'c'; i--) {
			
			System.out.print(i + " ");
			
		}
		
		System.out.println(" ");
		char harf='m';
		
		while (harf>'c') { System.out.print(harf + " ");
			
		harf--;
		}
		
		System.out.println(" ");
		
		char krk='m';
		
		do { System.out.print(krk + " ");
		krk--;
			
		} while (krk>'c');
		
		
	}

}
