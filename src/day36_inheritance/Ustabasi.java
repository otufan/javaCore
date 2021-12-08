package day36_inheritance;

import day35_encapsulation_inheritance.Isci;

public class Ustabasi extends Isci{

	Ustabasi(){
		System.out.println("Ustabasi parametresiz constructor calisti");
		
	}
	
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Ustabasi usta1=new Ustabasi();
		
		//Java da her class olusuturuldugunda otomatik olarak default constructor olustugu gibi
		//Child class" ta olusturulan her bir constructor in ilk satirinda gizli super() olusturur
		
		

	}

}
