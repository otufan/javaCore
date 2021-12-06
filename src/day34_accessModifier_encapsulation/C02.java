package day34_accessModifier_encapsulation;

public class C02 {

	public static void main(String[] args) {
		
		C01 obje=new C01();
		
		// System.out.println(obje.sayiPrivate);	private variable lara kendi class i disindan ulasilamaz
		System.out.println(obje.sayiDefault);
		System.out.println(obje.sayiProtected);
		System.out.println(obje.sayiPublic);
		
		
		
		

	}
	
	public void statikOlmayanMethod() {
		C01 obje=new C01();
		
		// System.out.println(obje.sayiPrivate);
		System.out.println(obje.sayiDefault);
		System.out.println(obje.sayiProtected);
		System.out.println(obje.sayiPublic);
		
		
	}

}
