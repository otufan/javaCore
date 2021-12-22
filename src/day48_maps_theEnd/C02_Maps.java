package day48_maps_theEnd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C02_Maps {

	public static void main(String[] args) {
		// Soru 3 ) Verilen map’te istenen programlama dilini bilen kisileri list olarak donduren bir method yaziniz.
		// map { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
		// Istenen dil java
		// Sonuc [Ali, Veli]
		
		
		Map<Integer, String> soruMap=MapOlustur.myMap();
		
		String istenenDil="Java";
		dilBilenListesiOlustur(soruMap, istenenDil);
		System.out.println(dilBilenListesiOlustur(soruMap, istenenDil));
		
		

	}

	private static List<String> dilBilenListesiOlustur(Map<Integer, String> soruMap, String istenenDil) {
		
		List<String> dilBilenListesi=new ArrayList<>();
		
		soruMap.values();//Collections dondurur
		
		List<String> valuesList=new ArrayList<>(soruMap.values());//Eleman sayisi 3
		//Bu 3 elemani tek tek ele alip split ile bolup dil degeri verilen inputa esit olanlarin isim degerlerini dilBilenListesi ne ekleyecegiz
		
		String parcaliArr[]=new String[valuesList.size()];
		
		for (String each : valuesList) {
		parcaliArr=each.split(", ");//[Ali, Can, Java] seklinde 3 elemanli bir array getirecek
		System.out.println(Arrays.toString(parcaliArr));
		if (parcaliArr[2].equalsIgnoreCase(istenenDil)) {
			dilBilenListesi.add(parcaliArr[0]);
		} 		
			
		}
		
		return dilBilenListesi;
		
	}

}
