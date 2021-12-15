package day42_abstractClasses;

public class Ustabasi extends Isci{

	public static void main(String[] args) {
		//obje olusturdugumuz en alttaki class parent class lardaki methodlari override edince class dan olusturulan objeler
		//en dogru ve spesifik ozelliklere kavustu
		
		//Ama klasik parent-child iliskisinde tum methodlari override etme mecburiyeti yoktur
		
		//Java parent class lardaki tum methodlari override etmek mecburiyeti kazandirmak icin 
		//Abstract class yapisini olusturmustur
		
		//Yani bir class i abstract olarak tanimlarsaniz Child classlar tum methodlari
		//override etmek zorunda kalir
		
		//Dolayisi ile abstract yaptigimiz parent classlar sadece kalip gorevi yapacaklar

		Ustabasi usta1=new Ustabasi();
		
		usta1.statu();
		usta1.maas();
		usta1.mesai();
		
	}
	public void statu() {
		System.out.println("Bu classtaki tum personel ustabasidir.. imza :Ustabasi");
	}
	public void maas() {
		System.out.println("Ustabaslari aylik 10bin TL maas alir.. imza :Ustabasi");
	}
	public void mesai() {
		System.out.println("Ustabasi ariza durumunda ariza cozuluncaye kadar mesai yapar... imza :Ustabasi");
	}

}
