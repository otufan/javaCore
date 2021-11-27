package day26_forEachLoop_constructor;

public class Car {
	//Java biz bir class olusturdugumuzda, o calss dan obje uretecegimizi bilir ve her class a default bir constructor yerlestirir
	//Java nin class a koydugu bu default constructor gorulmez ama obje uretmek uzere kod yazdigimizda otomatik olarak devreye girer
	
	//bir constructor olusturmak cok kolaydir
	//methoda benzer ama methoddan farklidir
	//1- Constructor ismi class ismi ile ayni olmalidir
	//class isimleri buyuk harfle basladigi icin Constructor ismi de buyuk harfle baslar
	//method dan birinci farki budur, method lar kucuk harfle baslar)
	//2-Constructor larin return type olmaz
	//method dan ikici farki budur, method larin mutlaka return type olmalidir.)
	
	 public Car() {
		
	}
	 
	 
	 //Java nin her class da olusturdugu constructor budur.
	 
	
	public int yil=2000;
	String renk;
	String model;
	int km;
	boolean sayilikMi;
	
	
	//Bugun itibar ile class larda main method olma mecburiyeti kaldirilmistir :)
	//Ancak bildigimiz gibi main method olmayan bir class direkt calistirilamaz
	//main method u olmayan class lar baska class lardan obje olusturularak kullanilmak uzere ihtiyac duyulan variable ve methodlari sakladigimiz
	//bir depo gibidir
	
	
}
