package day32_varargs_stringBuilder;

public class C05_StringBuilder {

	public static void main(String[] args) {
		
		String str="Ali Can";
		
		String str2=new String("Veli");
		
		StringBuilder sb=new StringBuilder("Yasasin Java");


		sb.append("! ! !");
		
		System.out.println(sb);
		
		String buyukHarfsb=sb.toString().toUpperCase(); //StringBuilder olusturup manipule ederek tekrar StringBuilder atama yapamayiz.
		
		System.out.println(buyukHarfsb);
		
	}

}
