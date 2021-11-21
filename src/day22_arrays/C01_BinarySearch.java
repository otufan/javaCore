package day22_arrays;

import java.util.Arrays;

public class C01_BinarySearch {

	public static void main(String[] args) {
	
		String isimler[]= {"mary", "Jack", "Kayra", "Neda", "Nil"};
		
		//isimler array in de Joseph var mi diye bakalim.
		
		//Array de arama yapmadan once siralama yapmaliyiz
		
		Arrays.sort(isimler); //kucukten buyuge siralama methodu
		//arrays class i ile sort yaptigimizda array imiz kalici olarak degisir
		
		System.out.println(Arrays.toString(isimler)); // [Jack, Kayra, Neda, Nil, mary]

		//sort methodu elementleri natural order a gore siralar
		
		isimler[4]="Mary";
		System.out.println(Arrays.toString(isimler));//[Jack, Kayra, Neda, Nil, Mary]
		
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler)); //[Jack, Kayra, Mary, Neda, Nil]
		
		System.out.println(Arrays.binarySearch(isimler, "Neda")); //3 ---- aradigimiz kelime varsa index
		
		System.out.println(Arrays.binarySearch(isimler, "John")); //-2 ---- aradigimiz kelime yoksa siralama

	}

}
