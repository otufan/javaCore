package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Fibonacci {

	public static void main(String[] args) {
		
		// 1000 den kucuk fibonacci sayilarini bir list olarak kaydedin
		
		List <Integer> liste=new ArrayList <>();
		
		//1,1,2,3,5,8,13,21,34,55
		
		liste.add(1);
		liste.add(1);
		
		int index=2;
		int sinir=0;
		
		do {liste.add(index, (liste.get(index-2)+liste.get(index-1)));
		sinir=liste.get(index-2)+liste.get(index-1);
		index++;
			
		} while (sinir<100);
		
		
		liste.remove(liste.size()-1);
		
		System.out.println(liste);
		
	}

}
