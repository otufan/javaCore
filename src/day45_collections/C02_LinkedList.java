package day45_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C02_LinkedList {

	public static void main(String[] args) {
		
		List<Integer> ll=new LinkedList<>();
		
		
		ll.add(5);
		ll.add(7);
		
		System.out.println(ll);//[]
		
		ll.add(9);//Data turu List sectigimiz icin sadece List interface indeki methodlari kullanabiliriz
		//LinkedList classs indan override ettigimiz icin
		//List interface olmasina ragmen List method kullanabildik
		
		Queue <Integer> ll2=new LinkedList<>();
		ll2.add(5);
		ll2.add(7);
		ll2.clear();//data turu Queue secilince Queue interface inden gelen methodlari kullanabildik
		
		Deque <Integer> ll3=new LinkedList<>();
		
		ll3.add(5);
		ll3.add(6);
		ll3.addLast(20);
	
		

	}

}
