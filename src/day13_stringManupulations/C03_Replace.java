package day13_stringManupulations;

public class C03_Replace {

	public static void main(String[] args) {
		
		String str="Java ogrenmek cok zevkli";
		
		System.out.println(str.replace(" ", "")); //Javaogrenmekcokzevkli --- butun bosluklari kaldirdik
		
		System.out.println(str.replace("ogrenmek", "kod yazmak")); //Java kod yazmak cok zevkli
		
		System.out.println(str.replace("Java", "Kod")); //Kod ogrenmek cok zevkli
		
		System.out.println(str.replace("e", "a")); //Java ogranmak cok zavkli

	}

}
