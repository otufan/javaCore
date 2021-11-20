package day21_scope_arrays;

public class C01_LokalVariables {
	
	String okulIsmi;

	public static void main(String[] args) {
		
		//Java lokal variable lara default deger atamasi yapmaz. Kodlarimizda sorun yasamamak icin olusturdugumuz lokal variable lara uygun bir deger 
		//atamamizda fayda var
		
		int sayi=0; //int sayi; dersek Java CTE veriyor
		System.out.println(sayi);
		
		// int sayi; //bir lokalde ayni isimde birden fazla variable OLUSTURULAMAZ
		//String sayi; //data turu farkli olsa da java buna izin vermez
		
		String isim="Ali";
		
		
		

	}
	
	public static void staticMethod() {
		
		//sayi; //bir lokal'de olusturulan variable (method larin static olup olmamasina bagli olmaksizin)
			    //farkli lokalde kullanilamaz
		
		String isim="Veli";
		
		
	}
	
	

}
