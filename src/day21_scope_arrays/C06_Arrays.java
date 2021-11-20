package day21_scope_arrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {
		// Soru 2: Verilen bir array’in tum elemanlarini toplayan bir program yazalim.
		
		
		int arr[]= {12,14,45,56,74,27,28};
		
		int toplam=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			toplam+=arr[i];
			
			System.out.print(toplam + " ");
			
		}
		System.out.println("");
		System.out.println("elementlerin toplami : " + toplam);
		
		
		//array in tum elemanlarini once kucukten buyuge, sonra kucukten buyuge yazdirin
		
		Arrays.sort(arr);
		System.out.println("Array in kucukten buyuge yazdirilmis hali "+Arrays.toString(arr));
		
		//buyukten kucuge yazdirmak icin ya for loop ile elemanlari yazdirabiliriz
		
		for (int i = arr.length-1; i >=0 ; i--) {
			
			System.out.print(arr[i]+" ");
			
		}
		
		//arra yapmak istersek ayni uzunlukta bir array olusturup elemanlari ters sirada yeni arraye tasiyabiliriz
		
		int tersArray[]=new int[arr.length];

		for (int i = arr.length-1; i >=0 ; i--) {
			
			tersArray[i]=arr[arr.length-1-i];
			
		}
		System.out.println("");
		System.out.print("Array' in buyukten kucuge yazdirilmis hali : " + Arrays.toString(tersArray));
		
		

	}

}
