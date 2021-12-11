package day39_overridingKurallari_polymorphism;

public class C02 extends C01{

	public static void main(String[] args) {
		
		C02 obje1=new C02();
		
		obje1.privateMethod();//Child class PRIVATE method calisti
		obje1.staticMethod();//Child class STATIK method calisti
		
		System.out.println("\n****C01 data turu ile obje olusturduk****\n");
		
		C01 obje2=new C02();
		
		
		//obje2.privateMethod(); // data turu C01 oldugundan oncelikle C01 classindaki methoda bakmamiz gerekir. Access Mod private oldugundan
		//ulasilamaz ve override yapilamaz. Dolayisiyla signature olmasina ragmen bu ikisi farkli iki method olarak calisir
		obje2.staticMethod();//Parent class STATIK method calisti
		//static methodlar override edilemez
		//dolayisiyla signature ayni olmasina ragmen iki farkli method olarak is gorurler 
	}

	public static void staticMethod() {
		System.out.println("Child class STATIK method calisti");
	}
	
	private void privateMethod() {
		System.out.println("Child class PRIVATE method calisti");
	}
	/*
	public final void finalMethod() {
	System.out.println("Child class FINAL method calisti");
	}*/
}
