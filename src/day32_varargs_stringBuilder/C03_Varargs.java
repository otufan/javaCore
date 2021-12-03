package day32_varargs_stringBuilder;

public class C03_Varargs {

	public static void main(String[] args) {
		
		kafanaGoreTopla(5, 10, 13, 0);
		
		

	}

	public static void kafanaGoreTopla(int sayi1, int sayi2, int... sayi) {
		int toplam=0;
		
		for (int each : sayi) {
			toplam+=each;
		}
		
		System.out.println("ilk sayi ile digerlerinin toplaminin carpimi : " + sayi1*toplam);
	}

}
