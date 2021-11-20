package day08_ifElseStatement;

import java.util.Scanner;

public class C06_IfElseIfStatement {

	public static void main(String[] args) {
		
		// Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
				//			Not’u harf sistemine cevirip yazdirin.
				//			50’den kucukse “D”,
				//			50-60 arasi “C”,
				//			60-80 arasi “B”,
				//			80’nin uzerinde ise “A”
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lutfen yuz uzerinden aldiginiz notu giriniz:");
		
		double not=scan.nextDouble();
		
		if (not<0 || not>100) {
			System.out.println("Lutfen gecerli bir not yaziniz!!!");
		} else if(not<50){
			System.out.println("Notunuz : D");
		}
		else if(not<60){
			System.out.println("Notunuz : C");
	
		}
			else if(not<80){
				
			System.out.println("Notunuz : B");
			
			}
			
			else {
				System.out.println("Notunuz : A");
			}
	scan.close();
		}
	
}
