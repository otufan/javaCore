package day47_maps;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMaps {

	public static void main(String[] args) {
		// icice map olusturacaksak en iceridekinden baslamak daha iyi olur
		
		Map<String, String> ogr1=new HashMap<>();
		ogr1.put("isim", "Ali");
		ogr1.put("soyisim", "Can");
		ogr1.put("brans", "J.dev");
		Map<String, String> ogr2=new HashMap<>();
		ogr2.put("isim", "Veli");
		ogr2.put("soyisim", "Yan");
		ogr2.put("brans", "QA");
		Map<String, String> ogr3=new HashMap<>();
		ogr3.put("isim", "Ali");
		ogr3.put("soyisim", "Yan");
		ogr3.put("brans", "C#");
		Map<String, String> ogr4=new HashMap<>();
		ogr4.put("isim", "Ayse");
		ogr4.put("soyisim", "Can");
		ogr4.put("brans", "QA");

		System.out.println("1. ogrenci : " + ogr1);
		System.out.println("2. ogrenci : " + ogr2);
		System.out.println("3. ogrenci : " + ogr3);
		System.out.println("4. ogrenci : " + ogr4);
		
		Map<Integer, Map<String, String>> sinifMap=new HashMap<>();
		
		sinifMap.put(101, ogr1);
		sinifMap.put(102, ogr2);
		sinifMap.put(103, ogr3);
		sinifMap.put(104, ogr4);
		
		System.out.println(sinifMap);
		/*{
		 * 101={soyisim=Can, brans=J.dev, isim=Ali}, 
		 * 102={soyisim=Yan, brans=QA, isim=Veli}, 
		 * 103={soyisim=Yan, brans=C#, isim=Ali}, 
		 * 104={soyisim=Can, brans=QA, isim=Ayse}}		
		 */
		
		
		
	}

}
