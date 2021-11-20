package day06_wrapper;

public class C03_ConditionalOperators {

	public static void main(String[] args) {
	
		System.out.println(5+3==8||6+5==10||7-2==3);//true
		
		System.out.println(5+3==8&&6+5==10&&7-2==3);//false
		
		
		int a=10;
		int b=20;
		int c=30;
		
		boolean sonuc=a>b || b>c || a+b>=c;
		
		System.out.println("sonuc :" + sonuc);
		
		// && isareti yerine & isareti kullanilabilir ancak arada bir nuans var 
		// && isareti ilk false buldugunda bu islemin sonucunun false olacagini bilir 
		//ve geriye kalan islemleri kontrol etmeden sonucu false yazdirir
		// & isarette java butun birlesenleri kontrol ediyor sonra sonucu false olarak yazdirir

		System.out.println(5+3==8 && 6+5==10 && 7-2==3); //false
		
		System.out.println(5+3==8 & 6+5==10 & 7-2==3);   //false
		
		int yas=50;
		int boy=180;
		char cinsiyet='M';
		
		System.out.println(yas<30 && boy>170 && cinsiyet=='M'); //false
		
		
		
		
	}

}
