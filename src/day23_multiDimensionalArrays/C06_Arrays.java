package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {
		// Verilen iki array i birlestiren 
		//ve sonucu birlesik array isminde bir array e kaydeden bir method olusturunuz
		//main method icinde yeni array i siralayip yazdirin
		
		int arr1[]={3,5,7,10};
		int arr2[]={2,4,6,8,9};

		int birlesikArray[]=arrayBirlestirme(arr1, arr2);
		Arrays.sort(birlesikArray);
		System.out.println(Arrays.toString(birlesikArray));
		
	}

	public static int[] arrayBirlestirme(int[] arr1, int[] arr2) {
		
		int birlesikArray[]=new int[arr1.length+arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
			birlesikArray[i]=arr1[i];
			
		}
		
		for (int i = 0; i < arr2.length; i++) {
			birlesikArray[arr1.length+i]=arr2[i];
		
		
	}
		return birlesikArray;

}
}
