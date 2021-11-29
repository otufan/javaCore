package day28_constructorCall_staticKeyword;

public class C03 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		//Java Run Time bir programdir. 
		//run tusuna basdigimizda java calismaya baslar ve islemleri yapar
		//java nin isi bittiginde (calisma tusu kirmizidan griye dondugunde)
		//hersey basa doner
		
		//static variable ve method lar bulunduklari class ile ilintilidir. (obje ile degil class ile)
		//baska bir class da iken c02 deki static variable veya method a ulasmak istedigimizde
		//C02.staticVariable ve C02.staticMethodIsmi() yazmamiz yeterli olur.
		
				C02 obje1=new C02();
				System.out.println("obje1 icin x : " + obje1.x + " obje1 icin y :" + C02.y ); // 5 10
				
				obje1.x++;
				obje1.y++;
				
				//static bir variable a class ismi uzerinden ulasmak yerine instance variable lar gibi obje ile ulasmaya calisirsaniz
				//JAVA CTE vermez ama solda ! isareti ile bizi uyarir
				//static bir field olan C02.y ye static yoldan ulas der
				
				System.out.println("islemden sonra obje1 icin x : " + obje1.x + " obje1 icin y :" + C02.y );//6 11
				
				C02 obje2=new C02();
				
				System.out.println("obje1 icin x : " + obje2.x + " obje1 icin y :" + C02.y ); //5 11
				
				obje2.x+=2;
				C02.y++;
				
				System.out.println("islemden sonra obje1 icin x : " + obje2.x + " obje1 icin y :" + C02.y ); // 7 12
				
				System.out.println("obje2 olusturulduktan ve islemden sonra obje1 icin x : " + obje1.x + " obje1 icin y :" + C02.y );// 6 12
				
				C02 obje3=new C02();
				
				obje3.x=20;
				C02.y=40;
				
				System.out.println("obje3 den sonra obje1 in x :" + obje1.x);//6
				
				System.out.println("obje3 den sonra obje2 in x :" + obje2.x);//7
				
				System.out.println("obje3 den sonra obje3 in x :" + obje3.x);//20
				
				System.out.println("obje3 den sonra obje1 in y :" + obje1.y);//40
				
				System.out.println("obje3 den sonra obje2 in y :" + obje2.y);//40
				
				System.out.println("obje3 den sonra obje3 in y :" + obje3.y);//40
				

	}

}
