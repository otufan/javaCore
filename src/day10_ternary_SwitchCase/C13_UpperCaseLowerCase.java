package day10_ternary_SwitchCase;

import java.util.Locale;

public class C13_UpperCaseLowerCase {

	public static void main(String[] args) {
		
		
		// verilen Stringin tamamini buyuk veya kucuk harfe cevirir. 
		
		String isim="aLI"; //bunu Ali olarak yazdiralim.
		
		System.out.println(""+isim.toUpperCase().charAt(0)+isim.toLowerCase().charAt(1)+isim.toLowerCase().charAt(2)); //ASCII degerleri oldugunda basa bir hiclik 
																														//eklemek gerekiyor
		
		//turkce lokal harfler kullanarak tamamini kucuk harfe cevirelim
		
		System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr")));

	}

}
