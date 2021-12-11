package day39_overridingKurallari_polymorphism;

public class C01 {
	
	public static void staticMethod() {
		System.out.println("Parent class STATIK method calisti");
	}
	
	private void privateMethod() {
		System.out.println("Parent class PRIVATE method calisti");
	}
	//final demek bu son hali, bir daha degistirilemez demektir. Dolayisiiyla Final olarak tamamlanan bir method
	//Override edilemez
	public final void finalMethod() {
		System.out.println("Parent class FINAL method calisti");
	}
	
	//child class ile parent class ayni package dan olduklarindan
	//methodlarin access modifierlari public, protected ve default olsaydi problem olmazdi
	//

}
