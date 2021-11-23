package day24_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_List {

	public static void main(String[] args) {
		// Verilen bir array'den istenen degere sahip elementleri silip
				// kalani yeni bir array olarak kaydedin
				// ve sonra yeni array'i yazdirin
		
				
			int arr[]= {3,4,5,6,3,5};
			int silinecekEleman=5;

			List <Integer> gecici=new ArrayList<>();
			
			for (int i = 0; i < arr.length; i++) {
				
				if (arr[i]!=silinecekEleman) {gecici.add(arr[i]);
					
				}
				
			}
			
			System.out.println("Liste olarak : " + gecici);//[4, 5, 6, 5]  
			//list olarak istenmeyen eleman haric tum elemanlari goruruz
			//sonucu array olarak istiyorsak 
			//listedekileri yeni array e ekleyebilirit
			
			int yeniArr[]=new int[gecici.size()];
			
			for (int i = 0; i < yeniArr.length; i++) {
				
				yeniArr[i]=gecici.get(i);
				
			}
			
			System.out.println("Array olarak : " + Arrays.toString(yeniArr));//[4, 5, 6, 5]
			
			
			
	}

}
