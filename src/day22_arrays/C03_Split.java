package day22_arrays;

import java.util.Arrays;

public class C03_Split {

	public static void main(String[] args) {
		// Java ogrendim, #cok para ?kazandim.,
		//cumlesinin kelimelerini, ozel karakter ve noktalama isaretleri olmadan harf sirasina gore yazdiralim
		
		String str="Java ogrendim,  #cok para ?kazandim.,";
		
		str=str.replaceAll("\\s", "X");
		str=str.replaceAll("\\W", "");
		str=str.replaceAll("X", " ");
		str=str.replaceAll("  ", " ");
		String arr[]=str.split(" ");
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("******   farkli method *********");
		
		
		String cumle="Java ogrendim,  #cok para ?kazandim.,";
		String  kelimeler[]=cumle.split(" ");
		
		for (int i = 0; i < kelimeler.length; i++) {
			kelimeler[i]=kelimeler[i].replaceAll("\\W", "");
		}

		System.out.println(Arrays.toString(kelimeler));
		
		Arrays.sort(kelimeler);
		
		System.out.println(Arrays.toString(kelimeler));
		
	
	}

}
