package day37_inheritence;

public class Corolla extends Toyota{

	String renk;
	int fiyat;
	boolean elektrikliMi;
	int tekerSayisi=4;
	String uretimYeri="Turkiye";
	
	
	public static void main(String[] args) {
		
		          Corolla                 araba1       =             new            Corolla();     
		   //Class ismi  &&  Data turu     obje ismi    assignment    keyword         Constructor
		
		          
		System.out.println(araba1.calisiyorMu);//araba class indan geldi
		System.out.println(araba1.tekerSayisi);// 4 <---bulundugu class dan aldi
		System.out.println(araba1.uretimYeri);//Turkiye
		//Java da obje olusturdugumuz her class ismi ayni zamanda bir data turudur.
		//Bu ornegimiz icin Corolla hem adi, hem de olusturdugumuz araba1 objesinin data type idir
		//Java da obje uretilen her bir class ayni zamanda non primitive data turu olur
		         
		Toyota araba2=new Corolla();
		
		System.out.println(araba2.calisiyorMu);//true
		System.out.println(araba2.tekerSayisi);//0
		
		Araba araba3=new Corolla();
		
		System.out.println(araba3.calisiyorMu);
		
		
	}

}
