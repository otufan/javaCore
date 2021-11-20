package day13_stringManupulations;

public class C02_Replace {

	public static void main(String[] args) {
		
		
		//string olarak verilen 10.000 sayisinin 10 den buyuk olup olmadigini yazdirin
		
		String sonuc="10.000";
		
		sonuc=sonuc.replace(".", "");//10000 e cevirip sonuc a assign ettik
									//= oldugu icin sonuc kalici olarak degisti
		
		if (Integer.valueOf(sonuc)>1000) {System.out.println("bulunan sonuc sayisi 1000' den cok");
			
		} else { System.out.println("bulunan sonuc sayisi 1000' den az");

		}
		

	}

}
