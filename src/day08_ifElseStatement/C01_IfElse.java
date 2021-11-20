package day08_ifElseStatement;

import java.util.Scanner;

public class C01_IfElse {

	public static void main(String[] args) {
		
		//Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup olmadigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lutfen dortgeninizin bir kenar uzunlugunu giriniz...:");
		
		double sayi=scan.nextDouble();
		
		if(sayi % 3 == 0){

			   System.out.println("Sayi 3 e bolunur");

			}else if(sayi % 3 == 1){

			  System.out.println("Sayi 3 e bolunemez ve kalan 1'dir");

			}else{

			  System.out.println("Sayi 3 e bolunemez ve kalan 2'dir");

			}




		scan.close();
	}

}
