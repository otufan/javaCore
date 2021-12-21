package day47_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {

	public static void main(String[] args) {
		//1- Bir map olusturmadan oncee, Map e koyacagimiz key ve value degerlerini incelemeliyiz
		//Tum degerleri koyabilmek icin key ve valur icin object, object secebiliriz
		//ama bu durumda map icindeki elemanlara ait bilgilere ulasmakta yorlanabiliriz
		//data turunu secerken hem icine koyacagimiz tum elemanlari kapsayacak bir data turu secmeliyiz
		//hem de icine koydugumuz tum elemanlari isleyebilecek sekilde basit data turu secmeliyiz
		
		//2- map i olustururken map in turune karar vermeliyiz
		
		Map<Integer, String> sinif=new HashMap<>();
		
		sinif.put(101, "Ali, Can, J.dev");
		sinif.put(102, "Veli, Yan, QA");
		sinif.put(103, "Ali, Yan, C# ");
		
		int no=104;
		String isim="Ayse";
		String soyisim="Can";
		String brans="QA";
		
		
		sinif.put(no, isim+ ", " + soyisim +", "+brans);
		
		System.out.println(sinif);//{101=Ali, Can, J.dev, 102=Veli, Yan, QA, 103=Ali, Yan, C# , 104=Ayse, Can, QA}
								  //   Key1=Value1           Key2=Value2       Key3=Value3        Key4=Value4
		
		//No su 102 ve 104 olan ogrencilerin bilgilerini gorelim
		System.out.println(sinif.get(102));//Veli, Yan, QA
		
		System.out.println(sinif.get(104));//Ayse, Can, QA
		
		
		//map deki tum keyleri gorelim
		
		
		System.out.println(sinif.keySet());//[101, 102, 103, 104]
		
		//map teki value lari gormek istersek
		
		System.out.println(sinif.values());//Collections olarak [Ali, Can, J.dev, Veli, Yan, QA, Ali, Yan, C# , Ayse, Can, QA]
		//ancak yazdirma islemi disinda birsey yapamayiz
		
		
		
		//siniftaki ogrencilerin isimlerini bir listeye ekleyip yazdiralim
		
		
		List<String> valueList=new ArrayList<>(sinif.values());
		
		System.out.println("value List : " + valueList);
		
		System.out.println(valueList.size());//4
		
		List<String> isimListesi=new ArrayList<>();
		String bilgiler[]=new String[3];
		
		
		for (int i = 0; i < valueList.size(); i++) {
			bilgiler=valueList.get(i).split(",");
			isimListesi.add(bilgiler[0]);
			
		}
		
		System.out.println(isimListesi);
		
		
				
	}

}
