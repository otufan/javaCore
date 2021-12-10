package day38_overriding;

public class Baliklar extends Animals{

	public static void main(String[] args) {
		Baliklar balik1=new Baliklar();
		balik1.beslenme();//Tum hayvanlar beslenir  <--- kendi classinda bu method olmaadigi icin parents class a gitti
		
		balik1.hareket();//Baliklar yuzerek hareket eder
		balik1.solunum();//Baliklar solungaclariyla nefes alir
	}
	
	@Override
	//Child class taki bir method parent class tan bir methodu override ediyorsa yani gecersiz kiliyorsa, bunu istersek
	//@override notasyonu ile declare edebiliriz
	//Deklare etmesekte kodumuz calisir
	//ancak deklare ettigimizde Java overriden method surekli kontrol eder ve o method overriding e uymayan bir degisiklik olurs acte verir
	public void hareket() {
		System.out.println("Baliklar yuzerek hareket eder");
	}
	
	public void solunum() {
		System.out.println("Baliklar solungaclariyla nefes alir");
	}
}
