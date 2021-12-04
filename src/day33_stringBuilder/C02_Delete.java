package day33_stringBuilder;

public class C02_Delete {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Java candir can");
		
		sb.delete(11, sb.length());
		
		System.out.println(sb);
		System.out.println(sb.capacity());//31 <--- kapasite degismiyor harfleri silse de
		
	}

}
