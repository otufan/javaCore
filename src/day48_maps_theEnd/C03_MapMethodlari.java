package day48_maps_theEnd;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C03_MapMethodlari {

	public static void main(String[] args) {


		Map<Integer, String> ornek=MapOlustur.myMap();
		
		System.out.println(ornek.containsKey(110));//false
		System.out.println(ornek.containsValue("JAVA"));//false
		System.out.println(ornek.containsValue("Ali, Can, Java"));//true

		Set<Entry<Integer, String>> entrySet=ornek.entrySet(); //herbir eleman entry 101=Ali, Can, Java
		
		int sayac=1;
		
		for (Entry<Integer, String> each : entrySet) {
			System.out.println(sayac + ". entry : " + each);
			sayac++;
		}

		System.out.println(ornek.getOrDefault(110, "girilen key map te yoktur"));//girilen key map te yoktur
		System.out.println(ornek.getOrDefault(102, "girilen key map te yoktur"));//Veli, Yan, Java
		
		ornek.putIfAbsent(104, "Fikri, Yan, C#");
		ornek.putIfAbsent(105, "Kerim, Ay, Pyhton");
		ornek.putIfAbsent(106, "Celil, Hal, QA");
		ornek.putIfAbsent(107, "Kutlu, Tay, Java");
		System.out.println(ornek);
		
		String maptenString=ornek.toString();
		System.out.println(maptenString);
	}

}
