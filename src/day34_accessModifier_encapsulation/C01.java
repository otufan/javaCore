package day34_accessModifier_encapsulation;

public class C01 {

	private int sayiPrivate=10;
	int sayiDefault=20;
	protected int sayiProtected=30;
	public int sayiPublic=40;
	
	
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
