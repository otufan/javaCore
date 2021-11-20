package day13_stringManupulations;

public class C04_ReplaceAll {

	public static void main(String[] args) {
		
		String str="*Java 98ogrenmek c..ok k876olay";
		
		//replaceAll methodlari kullanarak Java ogrenmek cok kolaya getirelim
		
		
		
		str=str.replaceAll("\\d", ""); //sayilari atmak icin \\d kullandik
		
		System.out.println(str); // *Java ogrenmek c..ok kolay
		
		str=str.replaceAll("\\s", "x"); // \\s ile sapece lerin yerini bir karakter atadik
		
		System.out.println(str); //*Javaxogrenmekxc..okxkolay
		
		str=str.replaceAll("\\W", ""); 
		
		System.out.println(str); //Javaogrenmekcokkolay 

		str=str.replace("x", " ");
		
		System.out.println(str); //Java ogrenmek cok kolay
		
		
	}

}
