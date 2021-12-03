package day32_varargs_stringBuilder;

public class C01_Varargs {

	public static void main(String[] args) {
		
		topla(5, 7, 10, 13, 15, 0);
		
		//varargs list gibi davranir ama Array method lari ile calisir
		
		

	}

	public static void topla(int... sayi) {
		int toplam=0;
		
		for (int each : sayi) {
			toplam+=each;
		}
		
		System.out.println("Girilen sayilarin toplami : " + toplam);
	}

}
