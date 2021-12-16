package day42_abstractClasses;

public class AbsUstabasi extends AbsIsci{

	public static void main(String[] args) {
		//concrete bir child class parent i olan abstract class lardaki tum abstract methodlari implement etmelidir
		//ama parent olan abstract classlardaki concrete methodlari implement etmek zorunda degildir
		AbsUstabasi usta1=new AbsUstabasi();
		
		usta1.maas();
		usta1.mesai();
		usta1.statu();
		
		

	}

	@Override
	public void mesai() {
		System.out.println("Ustabasi ariza durumunda ariza cozuluncaye kadar mesai yapar... imza :Ustabasi");
		
	}

	@Override
	public void maas() {
		System.out.println("Ustabaslari aylik 10bin TL maas alir.. imza :Ustabasi");
		
	}

	@Override
	public void statu() {
		System.out.println("Bu classtaki tum personel ustabasidir.. imza :Ustabasi");
		
	}

	@Override
	public void abstractMethod() {
		System.out.println("abstractMethod implement edildi");
		
	}



}
