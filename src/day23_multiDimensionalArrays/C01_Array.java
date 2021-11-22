package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Iterator;

public class C01_Array {

	public static void main(String[] args) {
		// Verilen bir array den istenen degere sahip elementleri silip 
		//kalani yeni bir array olarak kaydedin
		//ve sonra yeni array i yazdirin
		
		
		int arr[]= {3,4,5,6,3,5,8,3,4,9, 13, 12, 6};
		
		int silinecekEleman=3;
		
		//array de yeni eleman ekleyemeyiz veya var olan elemanlari silemeyiz
		//cunku array in declare edilen uzunlugu DEGISMEZ
		
		//bu soruda istenen elementi sildigimizde geride kac element kaliyor bulmamiz lazim
		//silinecek sayi adedini bulalim
		
		int sayac=0;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]==silinecekEleman) {sayac++;
				
			}
			
		}
		
		int yeniArrUz=arr.length-sayac;
		int yeniArr[]=new int[yeniArrUz];
		
		//simdi eski array deki elemanlari birer birer alip silinecek elemana esit olmayanlari yeni array e atamaliyiz
		
		int a=0;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]!=silinecekEleman) { yeniArr[a]=arr[i];
			a++;
				
			}
			
		}
		
		System.out.println(Arrays.toString(yeniArr));

	}

}
