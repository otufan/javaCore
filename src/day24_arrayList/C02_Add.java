package day24_arrayList;

import java.util.ArrayList;
import java.util.List;


public class C02_Add {

	public static void main(String[] args) {
		
		
		List<String> isimler=new ArrayList<>();
		System.out.println("Bos liste  : " + isimler);//[]
		
		isimler.add("Ali");
		
		System.out.println("Bir eleman : " + isimler);//[Ali]
		
		isimler.add("Veli");
		
		System.out.println("Iki eleman : " + isimler);//[Ali, Veli]
		
		//add methodu listenin sonuna ekleme yapar
		
		isimler.add("Can");
		
		System.out.println("Uc eleman :  " + isimler);//[Ali, Veli, Can]
		
		isimler.add(1, "Ayse");
		
		System.out.println("1. indexe Ayse ekledik  :  " + isimler);//[Ali, Ayse, Veli, Can]
		
		List <String> liste2=new ArrayList<>();
		liste2.add("Gunter");
		liste2.add("Emrah");
		
		System.out.println("liste 2 :" + liste2);
		
		isimler.addAll(4, liste2);
		
		System.out.println("liste 2 yi ekledik :" + isimler);//[Ali, Ayse, Veli, Can, Gunter, Emrah]
		
		isimler.addAll(liste2);
		
		System.out.println("index olmadan liste 2 yi tekrar ekledik :" + isimler);//[Ali, Ayse, Veli, Can, Gunter, Emrah, Gunter, Emrah]

	}

}
