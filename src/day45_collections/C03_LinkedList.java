package day45_collections;

import java.util.LinkedList;

public class C03_LinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll=new LinkedList<>();
				
		ll.add(5);
		ll.add(7);

		System.out.println(ll);//[]
		
		
		System.out.println(ll.peek());//silmeden ilk elemani bana getirir
		System.out.println(ll.peekFirst());//
		
		LinkedList<Integer> ll2=new LinkedList<>();
		
		System.out.println(ll2.peekFirst());//null
		System.out.println(ll2.peek());//null
		
		System.out.println(ll.element());//5 ilk elementi getirir
		//System.out.println(ll2.element());//java.util.NoSuchElementException ilk eleman yoksa run time error verir
		
		System.out.println(ll.poll());//5
		System.out.println(ll);// [7] cunku elemani getirip listeden sildi
		
		System.out.println(ll.hashCode());//38 
	
		ll2.add(7);
		System.out.println(ll2.offer(10));
		System.out.println(ll2);//[7, 10]
		
		ll2.push(2);//addFirst() ile ayni
		
		
	}

}
