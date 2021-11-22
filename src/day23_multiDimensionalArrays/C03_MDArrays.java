package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C03_MDArrays {

	public static void main(String[] args) {
		// Soru 1 ) Asagidaki multi dimensional array’in tum elemanlarinin carpimini ekrana  yazdiran bir method yaziniz.
		//{ {1,2}, {4,5,6,7} }

		int arr[][]={ {1,2}, {4,5,6,7}, {2,4,7} };
		
		carpim(arr);
		
		
		
	}

	public static void carpim(int[][] arr) {
		
		int carpim=1;
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				carpim*=arr[i][j];
				
			}
			
		}
		System.out.println("Carpim sonucu : " +carpim);
		
		
	}

}
