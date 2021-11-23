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
		
		
		
		
		

	}

}
