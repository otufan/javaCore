package day46_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

	public static void main(String[] args) {


		Queue<String> kuyruk=new LinkedList<>();
		
		kuyruk.add("Neda");
		kuyruk.add("Sueda");
		kuyruk.add("Ada");
		
		System.out.println(kuyruk);//[Neda, Sueda, Ada]
		
		kuyruk.remove();
		System.out.println(kuyruk);//[Sueda, Ada]
		
		kuyruk.remove();
		System.out.println(kuyruk);//[Ada]
		
		kuyruk.add("Ada");
		System.out.println(kuyruk);//[Ada, Ada]
		
		kuyruk.add(null);
		System.out.println(kuyruk);//[Ada, Ada, null]
		
	
		
		
	}

}
