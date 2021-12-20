package day46_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_HashSet {

	public static void main(String[] args) {

		//verilen bir arraydeki tekrar eden sayilari silip unique degerlerden olusan bir array olusturun
		
		int arr[]= {3,4,16,4,2,4,8,6,5,6,3,7,1};
		
		Set<Integer> benzersizSet=new HashSet<>();
		
		for (Integer each : arr) {
			benzersizSet.add(each);
		}
		
		System.out.println(benzersizSet);
		
		
			Object[] tekrarsizArr=benzersizSet.toArray();
		
		

		System.out.println(Arrays.toString(tekrarsizArr));
		
		
	}

}
