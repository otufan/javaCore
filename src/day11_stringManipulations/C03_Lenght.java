package day11_stringManipulations;

public class C03_Lenght {

	public static void main(String[] args) {
		
		
		String str1="Ali Kahyaoglu";
		
		System.out.println(str1.length()); //13---bosluk dahil toplam 13 
		
		
		//verilen str1 son harfini yazdirin
		
		System.out.println(str1.charAt(12)); //u
		
		//mesela verilan variable degisitigi icin statik degerler ile kod yazimi degilde dinamik yapi ile kod yazmak lazim
		
		
		System.out.println(str1.charAt(str1.length()-1));// u --- bu sekilde uzunlugun bizim icin onemi kalmiyor. formulize edildigi icin her halükarda son
														//karakter yazdirilmis olur
		
		String str2="";
		
		System.out.println(str2.length());//0
		
		String str3=null; // null degeri bu variable bilerek olusturdugumuzu ve bilerek deger atamadigimizi belirtiyor
		
		System.out.println(str3.length());//  java.lang.NullPointerException
		
		String str4;
		
		System.out.println(str3); //
		
		//System.out.println(str4);
		
		//null pointer olusturdugumuz fakat sonra kullanacagimiz bir String i isaretlemek icin kullanilir
		//Bir String i yazdirdigimizda null cikiyorsa turkce olarak 
		//Ben bu degiskeni olusturdum ama henuz deger atamadim demek istiyor...
		//Eger string olusturur ama deger atamazsak, yazdirdigimizda hata aliriz
		
		

	}

}
