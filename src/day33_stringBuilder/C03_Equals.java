package day33_stringBuilder;

public class C03_Equals {

	public static void main(String[] args) {
	
		
		StringBuilder sb1=new StringBuilder("Java");
		StringBuilder sb2=new StringBuilder("Java");
		
		System.out.println(sb1==sb2);//false
		System.out.println(sb1.equals(sb2));//false
		//stringbuilder da equalsmethodu string te ki mantikla calismaz
		//== mantigi ile calisir.. (clonlanip clonlanmadigini goruruz)
		
		
		System.out.println(sb1.compareTo(sb2));//0
		//ilk harflerden baslayarak bire bir sb leri karsilastirir
		//eger tum karakterler ayni ise sonuc olarak sifir doner
		//farkli karakter bulursa ilk yazilan sb ikinci yazilandan kac char onde onu doner 
		
		
		//eger iki string builder in esit olup  olmadigini anlamak istersek
		//if (sb1.compareTo(sb2)==0) ile bakabiliriz
		
		String str="Java";
		
		// System.out.println(sb1==str); <--- karsilastirilamaz cunku biri String digeri StringBuilder
		
		System.out.println(sb1.equals(str));//false 
		// System.out.println(sb1.compareTo(str)); <--- compare string icin kullanilamaz
		
		// System.out.println(sb1="Java");
		System.out.println(sb1.equals("Java"));//false
		//System.out.println(sb1.compareTo("Java"));
		
		
		
	}

}
