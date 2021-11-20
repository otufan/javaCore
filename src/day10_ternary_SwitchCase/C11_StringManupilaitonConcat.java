package day10_ternary_SwitchCase;

public class C11_StringManupilaitonConcat {

	public static void main(String[] args) {

		//string olarak verilen bir  degisken + ile baska bir degiskenle isleme sokulursa
		//JAVA bunlari yanyana ekler. Buna Concatenation denir
		
		String isim="Ali";
		String soyisim="Can";
		
		System.out.println(isim + " " + soyisim); //Ali Can
		
		//ayni islemi + sembolü yerine concat() ile de yapabiliriz
		
		
		System.out.println(isim.concat(soyisim));
		
		System.out.println(isim.concat(" ").concat(soyisim)); //string metodlarinda istedigimiz kadar metod kullanabiliriz. bu sekilde bosluk birakmis olduk
		
	}

}
