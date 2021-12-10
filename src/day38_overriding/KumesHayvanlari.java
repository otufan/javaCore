package day38_overriding;

public class KumesHayvanlari extends Kuslar{

	public static void main(String[] args) {
		
		KumesHayvanlari kms1=new KumesHayvanlari();
		
		kms1.beslenme();//Tum hayvanlar beslenir				<---Kendinde ve bir ust class ta olmadigi icin en ust parents gitti
		kms1.hareket();//Kumes hayvanlari yuruyerek hareket eder<--- kendinde yok o yuzden bir ust parents aldi
		kms1.solunum();//Kuslar akcigerleriyle nefes alir		<--- kendinde var oradan aldi
		
		
		Kuslar kms2=new KumesHayvanlari();
		
		kms2.beslenme();//Animals 				   ---> Tum hayvanlar beslenir
		kms2.hareket();// Kuslar ama kuslardan almadi-->Kumes hayvanlari yuruyerek hareket eder
		kms2.solunum();//Kuslar					  ----> Kuslar akcigerleriyle nefes alir
		//kendi spesifik ozellikleri disinda kuslara tabi oluyor
		//ama spesifik bir durum varsa farkini ortaya koyuyor
		
		
		Kuslar kms3=new Kuslar();
		kms3.beslenme();//Tum hayvanlar beslenir
		kms3.hareket();//Kuslar ucarak hareket eder
		kms3.solunum();//Kuslar akcigerleriyle nefes alir

		

	}
	@Override
	public void hareket() {
		System.out.println("Kumes hayvanlari yuruyerek hareket eder");
	}
}
