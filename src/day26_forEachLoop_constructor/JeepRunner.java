package day26_forEachLoop_constructor;

public class JeepRunner {

	public static void main(String[] args) {
		// Jeep class indan bir obje olustururalim ve ozelliklerini yazdiralim
		
		
		Jeep jepp1=new Jeep();
		
		System.out.println(jepp1.fiyat + " " + jepp1.ilanNo+" " +jepp1.marka+" " +jepp1.model+" " +jepp1.yil);//10000 1001 null null 2001
		
		
		//jeep class indaki variabler instance variable lar oldugundan atadigim degerler sadece benim objem icin degerleri degistirir.
		//jeep class indaki degerlere hicbir sey yapmaz
		jepp1.fiyat=15000;
		jepp1.ilanNo=2022;
		jepp1.marka="Toyota";
		jepp1.model="Auris";
		jepp1.yil=2017;
		
		System.out.println(jepp1.fiyat + " " + jepp1.ilanNo+" " +jepp1.marka+" " +jepp1.model+" " +jepp1.yil);//15000 2022 Toyota Auris 2017
		
		
		jepp1.hiz(150);

		jepp1.yakit("benzin");
		
	}

}
