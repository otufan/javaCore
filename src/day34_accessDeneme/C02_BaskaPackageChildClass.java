package day34_accessDeneme;

import day34_accessModifier_encapsulation.C01;

public class C02_BaskaPackageChildClass extends C01{

	public static void main(String[] args) {
		
		C01 obje=new C01();
		
		//System.out.println(obje.sayiPrivate);
		//System.out.println(obje.sayiDefault);
		//System.out.println(obje.sayiProtected); // main method dan ulasamamizin sebebi static klubu ile ilgili
		System.out.println(obje.sayiPublic);
		
		
	}

	public void statikOlmayanMethod() {
		
		C01 obje=new C01();
		
		//System.out.println(obje.sayiPrivate);
		//System.out.println(obje.sayiDefault);
		System.out.println(sayiProtected); //bu class da sayi protected diye bir variable olmadigi halde parent class da var oldugu icin
										   //Java problem yapmadi
		System.out.println(obje.sayiPublic);                     
		
	}
	
	
}
