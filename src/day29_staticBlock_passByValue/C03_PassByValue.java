package day29_staticBlock_passByValue;

public class C03_PassByValue {

	public static void main(String[] args) {
		// main method dan diger methodlara veya diger methodlardan main methoda bir variable gonderirsek Java orjinal variable lari degil
		//onlarin degerlerini (value) goturur, orjinal variable in degeri degismez
		
		
				int fiyat=100;
				
				System.out.println(indirimYap25(fiyat));// %25 indirimli fiyat : 75
				System.out.println("method' dan sonra main method' daki fiyat :" + fiyat);//100
				
				//indirimi kalici yapmak istiyorsak main method icinde atama yapmamiz gerekir
				fiyat= indirimYap10(fiyat); // %10 indirimli fiyat :90
				System.out.println("method' dan sonra main method' daki fiyat :" + fiyat);//
				

			}

			private static int indirimYap25(int fiyat) {
				fiyat*=0.75;
				return fiyat;
			}

			private static int indirimYap10(int fiyat) {
				
			fiyat*=0.90;
			return fiyat;
			}

}
