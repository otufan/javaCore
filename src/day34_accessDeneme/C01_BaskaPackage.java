package day34_accessDeneme;

import day34_accessModifier_encapsulation.C01;

public class C01_BaskaPackage {

	public static void main(String[] args) {
		
		C01 obje=new C01();
		
		//System.out.println(obje.sayiPrivate);
		//System.out.println(obje.sayiDefault);   sadece ayni package dakiler ulasabilir
		//System.out.println(obje.sayiProtected); ayni package daki classlar ve child classlar ulasabilir
		System.out.println(obje.sayiPublic);
		
	}

}
