package day24_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_Remove {

	public static void main(String[] args) {
		
		List<String> harfler=new ArrayList<>();
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");

		System.out.println(harfler);//[A, Z, F, D]
		
		harfler.remove(1);// bu satir gidip 1 index indeki elemani remove eder ve delil olarak remove ettigi elemani bize getirir.
		
		//listenin kalanini gormek isterseniz listeyi yazdirabilirsiniz
		
		System.out.println(harfler);//[A, F, D]
		
		harfler.remove("D");
		System.out.println(harfler.remove("F")); //gidip F yi remove eder ve true dondurur
		
		System.out.println(harfler.remove("B")); //listede B olmadigi icin remove yapamaz ve gorevi yapamadigi icin false doner
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		System.out.println(harfler); //[A, A, Z, F]
		
		System.out.println(harfler.remove("A")); // true
		
		System.out.println(harfler); //[A, Z, F] ilk buldugu A harfini siler
		
		harfler.add("A");
		
		System.out.println(harfler);//[A, Z, F, A]
		
		harfler.removeAll(harfler); //verilen bir listeyi siler
		
		System.out.println(harfler); //[]
		
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");
		
		List<String> silinecekHarfler=new ArrayList<>();
		
		silinecekHarfler.add("A");
		silinecekHarfler.add("C");
		silinecekHarfler.add("F");
		
		System.out.println(harfler);//[A, Z, F, D]
		System.out.println(silinecekHarfler);//[A, C, F]
		
		
		System.out.println(harfler.removeAll(silinecekHarfler));//true
		
		
		System.out.println(harfler);//[Z, D]
		
		//eger listemiz integer larda olusuyorsa 
		//remove(index) ve remove(objekt) methodlari karismasin diye 
		//girilen sayi index olarak kabul eder.
		
		
		
		/*Scanner scan=new Scanner(System.in);
		
		harfler.remove(scan.next());
		
		System.out.println(harfler);
		
		harfler.add(0, scan.next());
		
		System.out.println(harfler);*/
		
		
	}

}
