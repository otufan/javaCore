package day20_scope;

public class StaticVariables {

	static int no=20;
	static int sayi;
	static String adres="Ankara";
	static String cadde;
	static boolean aktifMi=true;
	static boolean tatildeMi;
	
	
	
	
	public static void main(String[] args) {
		//static variable lara main method dan direkt ulasilabilir mi? EVET
		
		System.out.println(no);//20
		no++;
		System.out.println(no);//21
		staticMethod();
		
		System.out.println(no);//22
		
		StaticVariables obje=new StaticVariables();
		
		obje.staticOlmayanMethod();//23

		
		
	}
	
	
	public static void staticMethod() {
		//static variable lara main method dan direkt ulasilabilir mi? EVET
		 no++;
		 System.out.println("statik method da sayi :" + no);//22
		
	}
	
	public void staticOlmayanMethod() {
		//static variable lara main method dan direkt ulasilabilir mi? EVET
		//statik variable lara static olan veya olmayan tum methodlardan tum methodlardan ulasilabilir
		//bu yuzden static variable lara CLASS VARIABLE denir
		no++;
		System.out.println("statik olmayan method da sayi :" + no);//23
	}

}
