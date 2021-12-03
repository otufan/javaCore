package day32_varargs_stringBuilder;

public class C04_Varargs {

	public static void main(String[] args) {

		topla(5, 10, 13, 0, 12);
		
		//varargs tan once farkli parametreler kullanilabilir, ama varargs tan sonra parametre yazilamaz.
		//yazarsak Java varargs son parametre olmalidir diye sizi uyarir ve CTE verir

	}

	public static void topla(int... sayi) {
		int toplam=0;
		
		for (int each : sayi) {
			toplam+=each;
		}
		
		System.out.println("Girilen sayilarin toplami : " + toplam);
	}

}
