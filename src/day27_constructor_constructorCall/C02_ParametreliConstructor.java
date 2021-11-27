package day27_constructor_constructorCall;

public class C02_ParametreliConstructor {

	public static void main(String[] args) {
		// Java nin olusturdugu default constructor ile obje olusturabiliyoruz ama her obje icin deger atamasi yapmak uzun oluyor
		//istersek parametreli constructor olusturup daha obje olustururken istedigim ozellikleri atayabilirim

		Car1 car1=new Car1(50000, "Vectra", "Beyaz", 2015, true);
						//int km, String model, String renk, int yil, boolean satilikMi
		
		Car1 car2=new Car1(35000);
				       // int km
		
		System.out.println(car2.km);
	}

}
