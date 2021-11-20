package day06_wrapper;

public class C4_If {

	public static void main(String[] args) {
	
		int a=10;
		int b=20;
		
		if (a>5) {
			
			System.out.println("a sayisi 5'den buyuk");
			
		}
				
		if (a>b) {
			System.out.println("a sayisi b den buyuk");
		}

		if (b>100) {
			
			System.out.println("b sayisi 100'den buyuk");
			
		}
		
		//basit if cumleleri bagimsiz calisir, tum if lerin body' si calisabilir veya bazilari calisabilir hatta hicbirinin body si calismayabilir
		//her bir if cumlesi kendi sartina bakar, sart true ise body calisir, sart false ise body calismaz
		
		
	}

}
