package day04_increment_decrement;

public class C05_IncrementDecrement {

	public static void main(String[] args) {
		
		int sayi1=10;
		
		System.out.println(sayi1+=5); //15
		//bu islem sayi1'in degerini 5 arttirip sayi1'e assign ediyor
		//bu nedenle sayi1'in degeri kalici olarak degisiyor
		
		System.out.println(sayi1); //15 
		
		System.out.println(sayi1+12); //27
		
		System.out.println(sayi1);//15
		
		sayi1++;
		//her ne kadar = isareti gorulmese de sayi1++ isleminde assign vardir
		//
		
		System.out.println(sayi1);//
		
		System.out.println(sayi1++);

	}

}
