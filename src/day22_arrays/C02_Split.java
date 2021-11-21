package day22_arrays;

import java.util.Arrays;

public class C02_Split {

	public static void main(String[] args) {
		
		
		//Java ogrenmek cok guzel
		//cumlesinin kelimelerini ters sirada yazdirin
		
		String str="Java ogrenmek cok guzel";
		
		String arr[]=str.split(" ");
		
		System.out.println(Arrays.toString(arr));
		
		for (int i = arr.length-1; i>=0; i--) {
			
			System.out.print(arr[i] + " ");
			
		}
	
	
	}

}
