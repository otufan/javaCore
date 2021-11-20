package day03_scanner;

public class C01_SwapVariable {

	public static void main(String[] args) {

		int sayi1=10;
		
		int sayi2=20;
		
		//baslangicta sayi1=10 ve sayi2=20
		
		System.out.println("baslangicta sayi1=" + sayi1 + " ve sayi2=" + sayi2);
		
        int bos;
     
        bos=sayi2;
        
        sayi2=sayi1;
        
        sayi1=bos;
        
        System.out.println("sonunda sayi1=" + sayi1 + " ve sayi2=" + sayi2);
        
        
        
	}

}
