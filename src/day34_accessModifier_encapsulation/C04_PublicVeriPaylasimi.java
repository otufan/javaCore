package day34_accessModifier_encapsulation;

public class C04_PublicVeriPaylasimi {

	public static void main(String[] args) {
		
		C03 obje=new C03();
		
		System.out.println(obje.isim);//Ali Can
		System.out.println(obje.maas);//10000
		
		obje.isim="Veli Cem";
		obje.maas=15000;
		
		System.out.println(obje.isim);//Veli Cem
		System.out.println(obje.maas);//15000
		
		
		
		
	}

}
