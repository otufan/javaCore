package day33_stringBuilder;

public class C07_Yarisma {

	public static void main(String[] args) {
		//Soru : For loop ile 1000 defa bir islem yapalim. 
		//Oncesinde ve sonrasinda zamani kontrol edip StringBuilder ve String class’larinin performanslarini karsilastiralim.   
		//Ipucu: long TimeSb = System.nanoTime(); kullanalim
		
		StringBuilder sb=new StringBuilder("a");
		sb.trimToSize();//capacity i lenght boyutuna indirir
		String str="a";
		
		long strTimeStart = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			
			str+=" ";
			
		}
		long strTimeFinish= System.nanoTime();
		
		long stringSure=strTimeFinish-strTimeStart;
		
		long sbTimeStart = System.nanoTime();
		
		for (int i = 0; i < 1000; i++) {
			
			sb.append(" ");
			
		}
		
		long sbTimeFinish= System.nanoTime();
		
		long sbSure=sbTimeFinish-sbTimeStart;
		
		if (sbSure>stringSure) { System.out.println("String daha hizli");
			
		} else {System.out.println("StringBuilder daha hizli");

		}
		
		System.out.println(stringSure/sbSure);
		
	}

}
