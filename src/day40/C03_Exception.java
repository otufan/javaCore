package day40;

import java.util.Scanner;

public class C03_Exception {

	public static void main(String[] args) {
		// Verilen bir integer array icin kullanicidan sayi isteyin
		//girilen sayiyi index olarak kabul edip o indexte ki elementi yazdirin
		
		int arr[]= {2, 6, 9, 1, 2, 5, 8, 4};
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen elementi yazdirmak icin index giriniz : ");
		int index=scan.nextInt();
		
		System.out.println("Girdiginiz indexteki element : " + arr[index]);
		
		
		
	}

}
