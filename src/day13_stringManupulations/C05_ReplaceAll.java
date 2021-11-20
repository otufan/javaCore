package day13_stringManupulations;

public class C05_ReplaceAll {

	public static void main(String[] args) {
		
		
		String cumle="Java    cok    zevkli";
		
		cumle=cumle.replaceAll("\s+", " "); //Java cok zevkli
		
		System.out.println(cumle);
		
		System.out.println(cumle.replaceAll("[a-z]", "")); //J   a ve z arasinda ki kucuk harfleri yok etti
		
		System.out.println(cumle.replaceAll("\\S", "*"));

	}

}
