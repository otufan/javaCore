package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05_Array {

	public static void main(String[] args) {
		// Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lutfen bir cumle giriniz : ");
		
		String str=scan.nextLine();
		
		str=str.replaceAll("\\s", "X");
		str=str.replaceAll("\\W", "");
		str=str.replaceAll("X", " ");
		str=str.replaceAll("  ", " ");
		String arr[]=str.split(" ");
		
		System.out.println("Girilen cumlede toplam " + arr.length+ " kelime vardir");
		System.out.println(Arrays.toString(arr));
		
		
	}

}
