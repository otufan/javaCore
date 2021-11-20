package day11_stringManipulations;

public class C04_IndexOf {

	public static void main(String[] args) {
		
		//parametre olarak girilen vir char veya string'in ilk index ini verir
		
		String str="Calisirsaniz, Java ogrenmek cok kolay";
		
		
		System.out.println(str.indexOf('s')); //4
		
		System.out.println(str.indexOf("J")); //14
		
		int index=str.indexOf("r"); //indexOf() methodu bize her zaman bir int deger doner
		
		System.out.println(index); //6
		
		System.out.println(str.indexOf('q')); // -1 cunku bu harf yok.
		
		// eger bu string icinde olayan bir karakter veya kelime ararsak Java  index degeri olarak -1 sonucu dondurur.
		
		System.out.println(str.indexOf('A')); // -1 doner cunku A yok Java case sensitive dir
		
		System.out.println(str.indexOf("va og"));//16
		
		//aradigimiz charSequence anlamli veya anlamsiz bir kelime olabilir
		//bu durumda Java aradigimiz CS' i tek bir paket gibi dusunur ve o paketin baslangic indexini bize bildirir
		
		
		
		System.out.println(str.indexOf('e', 15)); // 22---15 den sonraki ilk degeri verir
	}

}
