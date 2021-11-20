package day19_whileLoop_doWhileLoop;

public class C03_DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;
		
		while (i<5) {
			System.out.print(i+ " "); //0 1 2 3 4
			i++;
		
		}
		System.out.println(" ");
		
		//while loop once kontrol eder sonra kodu calistirir. loop icinde artis yapilsa da bir sonraki kontrole kadar kod calismaya devam eder.
		//bu da bazi durumlarda hatali sonuclara ulasmamiza sebep olabilir...
		
		
		
		//do-while loop ise once islemi yapar ve sonra sarti kontrol eder
		//ozellikle kullanicidan deger almalarda do while loop tercih edilir
		int a=0;
		do { System.out.print(a+ " ");
		a++;
			
		} while (a<5); //
	}

}
