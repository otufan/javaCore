package day42_abstractClasses;

public abstract class AbsPersonel {

	
	//class ve methodu abstract olarak tanimladigimda child classlar mecburen bu methodu override edecekler
	//
	public abstract void statu();
	
	abstract public void abstractMethod();
	
	public void concreteMethod() {
		System.out.println("Personel class indaki concrete Method calisti");
	}


}
