package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_List {

	public static void main(String[] args) {
		// verilen bir listede icinde belirli bir harf olan elemanlari 
		//silen bir method yaziniz
		
		
		List <String> str= new ArrayList <>();
		
		str.add("Ceyhan");
		str.add("Yildiz");
		str.add("Mustafa");
		str.add("Tugba");
		str.add("Turgat");
		
		
		System.out.println(str);
		
		String sH="a";
		
		sil(str, sH);

	}

	private static void sil(List<String> str, String sH) {
		
		
		
		for (int i = str.size()-1; i >=0 ; i--) { // sondan baslanmasi gerekiyor. bastan baslayinca indexler degisiyor cunku
			
			if (str.get(i).contains(sH)) { str.remove(i);
			
			}
			
		}
		
		System.out.println(str);
	}

	
}
