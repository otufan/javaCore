package day32_varargs_stringBuilder;

public class C03_Varargs {

	public static void main(String[] args) {
		
		kafanaGoreIslem(5, 10, 13, 0);
		
		//varargs da hic eleman olmasa da Java itiraz etmez. Once int olarak tanimlanan sayilari eslestirir. 
		//Kalan tum sayilari varargs a doldurur

	}

	public static void kafanaGoreIslem(int sayi1, int sayi2, int sayi3, int sayi4, int... sayi) {
		int toplam=0;
		
		for (int each : sayi) {
			toplam+=each;
		}
		
		System.out.println("ilk sayi ile digerlerinin toplaminin carpimi : " + sayi1*toplam);
	}

}
