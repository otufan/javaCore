package day34_accessModifier_encapsulation;

public class C01 {

	private int sayiPrivate=10;
	//private class uyelerine sadece icinden bulundugu class dan ulasabiliriz
	
	int sayiDefault=20;
	//default class uyelerine sadece icinde bulundugu package dan ulasilabilir
	//default access modifier in diger ismi de package access modifier dir
	
	protected int sayiProtected=30;
	//protected class uyelerine icinde bulundugu package daki tum class lar ve baska package larda ki child class lar ulasabilir
	
	public int sayiPublic=40;
	//public class uyelerine tum package lardaki class lardan ulasilabilir
	
	public static void main(String[] args) {
		
		C01 obje=new C01();
		
		System.out.println(obje.sayiPrivate);
		System.out.println(obje.sayiDefault);
		System.out.println(obje.sayiProtected);
		System.out.println(obje.sayiPublic);

	}

	public void statikOlmayanMethod() {
		
		C01 obje=new C01();
		
		System.out.println(obje.sayiPrivate);
		System.out.println(obje.sayiDefault);
		System.out.println(obje.sayiProtected);
		System.out.println(obje.sayiPublic);
		
		
		
	}
	
	
}
