package day27_constructor;

public class TirRunner {

	public static void main(String[] args) {
		//bir tane tum ozellikleri degistiren constructor olusturalim
		
		Tir tir1=new Tir(5000, "Axor", "Beyaz", 2020, false);
						//int km, String model, String renk, int yil, boolean satilikMi
		
		System.out.println(tir1.km + " " +tir1.model + " " + tir1.renk + " " + tir1.yil + " " +tir1.satilikMi);//5000 Axor Beyaz 2020 false
		
		//uc ozelligi degistiren bir constructor olusturalim
		//int km, String model, String renk
		
		Tir tir2=new Tir(12000, "kar", "Yesil");

		System.out.println(tir2.km + " " + tir2.model+ " " + tir2.renk+" "+ tir2.yil + " " +tir2.satilikMi);//12000 kar Yesil 2000 false

		
	}

}
 