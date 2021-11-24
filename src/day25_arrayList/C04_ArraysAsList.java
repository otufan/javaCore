package day25_arrayList;

import java.util.Arrays;
import java.util.List;

public class C04_ArraysAsList {

	public static void main(String[] args) {
		
		//verilen array i Arrays class indan yardim alarak liste cevirebiliriz
		
		Integer arr[]= {3,5,7,10};
		
		
		List <Integer> arraydenList=Arrays.asList(arr);
		
		System.out.println(arraydenList);//[3, 5, 7, 10]

		// arraydenList.add(9); -----> Run time error verir-UnsupportedOperationException ---> desteklenmeyen islem
		// System.out.println(arraydenList);  
		
		arr[1]=9;
		
		System.out.println("Array i degistirdikten sonra, array :" + Arrays.toString(arr)); //[3, 9, 7, 10]
		System.out.println("Array i degistirdikten sonra, list : " + arraydenList); //[3, 9, 7, 10]
		
		arraydenList.set(3, 2);
		
		System.out.println("Array i degistirdikten sonra, array :" + Arrays.toString(arr)); //[3, 9, 7, 2]
		System.out.println("Array i degistirdikten sonra, list : " + arraydenList); //[3, 9, 7, 2]
		
		//bu sekilde list ile array i birbirine bagladik. nerede bir degisiklik yaparsak dogerini de e
	}

}
