package day20_scope;

public class InstanceVar {

	int notMat=50;
	int notFen;
	
	//instance variable larin scopeda main method yoktur.
	
	
	public static void main(String[] args) {
	
		//System.out.println(notMat); //main method static oldugu icin statik olmayan variable lar main method ta direkt kullanilamaz 
									// veya goruntulenemez
		
		//instance variable lara main methoddan ulasmak istersek obje olusturup obje uzerinden erisim saglayabiliriz
		
		//Scanner scan=new Scanner(System.in);
		//icinde oldugumuz class tan bir obje olusturalim
		
		InstanceVar celil=new InstanceVar();
		
		System.out.println(celil.notMat); //50 
		
		
		InstanceVar nihal=new InstanceVar();
		nihal.notMat=70;
		
		System.out.println(nihal.notMat);//70
		
		//instance variable larda deger atamazsak Java, instance olarak atanan degeri alir.
		//Bu class icin notMat=50 gibi
		//ama istersek deger de atayabiliriz, bu durumda deger atadigimiz obje icin yeni deger gecerli olur
		
		System.out.println(celil.notMat); //50 
		
		//Celilin notunu degistirmek istiyorsak celil.notMat a deger atamaliyiz
		
		celil.notMat=90;
		
		System.out.println(celil.notMat); //90 
		
		//method();//method2 static olmadigi icin main method dan direkt olarak cagrilamaz
		
		celil.method2();//0

	}

	public static void staticMethod() {
		
		//System.out.println(notFen); //instance variable lara static methodlara direkt olarak ulasilamaz
		
		
		
	}
	
	public void method2( ) {
		
		System.out.println("method2' deki notfen : "+notFen); //bu method statik olmadigi icin instance variable lara direkt ulasabilir
		//instance variable lar olusturulurken deger atanmasa da olur bu durumda java default deger atar
		//int icin default deger 0' dir
		
		notFen=100;
		System.out.println("method2' deki duzeltilmis notfen : "+notFen);
		
	}
	
	
	
}
