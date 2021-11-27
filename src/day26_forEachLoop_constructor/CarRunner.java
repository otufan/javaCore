package day26_forEachLoop_constructor;



public class CarRunner {

	public static void main(String[] args) {
		// Car class indan bir obje olusturalim
		
		      Car         car1            =            new         Car();
		//class ismi    objenin ismi   assigment     keywort     Constructor call 
		      
		      
		System.out.println(car1.km + " " + car1.model + " " + car1.renk + " " + car1.yil);//0 null null 2000
		
		//Bie obje olustururken eger obje icin kendi class inda belirlenen degerleri kullanmak istiyorsam
		//hicbir degeri kendim atamadan obje olusturabilirim. Bu durumda hicbir parametre kullanilmadigi icin default constructor yeterli olacaktir
		
		
		
		//Eger obje olusturdugum class daki degerleri kullanmak yerine kendi degerlerimle bir obje olusturmak istersem o zaman parametreli constructor 
		//olusturmam gerekir
		
		// Car car2=new Car("Kirmizi", "Corolla");
		
		
		//Car class inda 2 String parametresi olan bir cosntructor olmadigi icin bu obje olusturmayi simdilik yapamayiz
		
		

	}

}
