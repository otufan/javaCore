package day33_stringBuilder;

public class C04_Insert {

	public static void main(String[] args) {
	
		StringBuilder sb=new StringBuilder("Java ogrendik");
		
		//araya "cok iyi" ekleyelim
		
		sb.insert(4, "yi cok iyi" );
		System.out.println(sb);//Javayi cok iyi ogrendik
		
		
		//sonuna , yasasin ekleyelim
		
		sb.insert(sb.length(), ", yasasin");
		
		System.out.println(sb);//Javayi cok iyi ogrendik, yasasin --- sonuna ekleme oldugu icin append methodu da kullanilabilirdi
		
		
		String str2="Java al cok yasa";
		sb.insert(6, str2, 7, 11);
		System.out.println(sb);
		
		
		
		

	}

}
