package day10_ternary_SwitchCase;

public class C12_SMCharAt {

	public static void main(String[] args) {
		
		
		//charAt(istenen Index) methodu istedigimiz index d eki karakteri bize verir.
		
		String kurs="Techproeducation";
		
		System.out.println(kurs.charAt(5)); //r
		
		//index 0' dan baslar
		
		System.out.println(kurs.charAt(0)); //bize ilk harfi verir yani T
		
		System.out.println(kurs.charAt(16)); //hata verir... index sinirlarinin otesinde yazilamaz cunku
											 //kelimenin uzunlugu -1 dememiz lazim cunku index 0 dan baslar
		
		
	}

}
