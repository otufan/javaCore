package day35_encapsulation_inheritance;

public class Personel {
	
	protected String isim;
	protected String soyisim;
	protected boolean calisiyorMu;
	protected String telNo;
	protected int yas;
	
	Personel (){
		System.out.println("Personel parametresiz constructor calisti");
	}
	
	//eger variable lara access modifoer yazmazsak Java access modifier olarak default acc. mod. atar
	//boyle olursa sadece o package altindaki child class lar personel class ini inherit edebilir
	//baska package larda ki chuild class larin da personel inherit edebilmesi icin variable ve method larin acc mod protected yapariz
	//publicyapsak ta inherit edilebilir ama biz herkesin erismesi degil de sadece child classlarin erismesini istedigimiz icin protected yapariz
	
	public static void main(String[] args) {
		

	}

}
