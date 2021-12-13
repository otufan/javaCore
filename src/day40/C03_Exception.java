package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exception {

	public static void main(String[] args) {
		// Verilen bir integer array icin kullanicidan sayi isteyin
		//girilen sayiyi index olarak kabul edip o indexte ki elementi yazdirin
		
		int arr[]= {2, 6, 9, 1, 2, 5, 8, 4};
		//InputMismatchException
		//ArrayIndexOutOfBoundsException
		
		try {
			Scanner scan=new Scanner(System.in);
			System.out.print("Lutfen elementi yazdirmak icin index giriniz : ");
			int index=scan.nextInt();
			System.out.println("Girdiginiz indexteki element : " + arr[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Girdiginiz index Array de yok");
		} catch (InputMismatchException e) {
			System.out.println("Girdiginiz index pozitif tam sayi olmalidir");
		}
		
				
		
		
	}

}
