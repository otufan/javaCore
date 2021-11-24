package day25_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Contains {

	public static void main(String[] args) {
		
		
		//verilen bir array de tekrar eden elementleri sadece birer tane yazarak 
		//unique elementlerden olusan bir array haline getirelim
		
		int arr[]= {2,3,4,5,7,4,2,5,7,9,7,2,1,3,5,6,8,9,0};
		
		//2,3,4,5,7,9,1,6, 8,0
		
		List <Integer> tekrarsiz=new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if(!tekrarsiz.contains(arr[i])) {
				
				tekrarsiz.add(arr[i]);
				
			}
			
			
			
		}
		
		System.out.println("Listemiz  :  "+ tekrarsiz);

		int arrNew[]=new int[tekrarsiz.size()];
		
		for (int i = 0; i < arrNew.length; i++) {
			arrNew[i]=tekrarsiz.get(i);
			
		}
		
		System.out.println("Yeni array : " + Arrays.toString(arrNew));
		
		
	}

}
