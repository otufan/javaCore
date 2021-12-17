package day43_Interface;

public interface C02_Interface {

	abstract void motor(); //normal class larda access modifier yazilmazsa java default access mo. kabul eder
				//interface ise access mod olarak public kabul eder
	
	
	int sayi=10; //final ve static olarak kabul eder Java
	
	//interface de body si olan bir method yazmak isterseniz Java size iki alternatif sunar
	//1.Methodun basina "default" keyworrd yazabiliirsiniz ancak burada yazilan default access modifier degil
	//Java nin interface icin kabul ettigi ozel bir keywort tur
	//
	public default void kaporta() {
		System.out.println("Interface kaporta");
	}
	
	public static void sanzuman() {
		System.out.println("Interface sanzuman");
	}
	
	
}
