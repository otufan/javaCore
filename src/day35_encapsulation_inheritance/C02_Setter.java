package day35_encapsulation_inheritance;

public class C02_Setter {

	public static void main(String[] args) {
		
		//ogretmenler ogrencinin notunu girebilsin
		//ama tum notlarini goremesin sadece gecip gecemedigini gorsun
		
		
		C01 ogr1=new C01();
		
		System.out.println(ogr1.isGecerMi());//false
		
		ogr1.setNot(65);
		
		System.out.println(ogr1.isGecerMi());//

	}

}
