package day29_staticBlock_passByValue;

public class C01_StaticBlocks {

	static {
		System.out.println("statik blok main method' dan bile once calisir");
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Java da once main method calisir");

	}
	
	static {
		System.out.println("statik blok nereye yazilirsa yazilsin main method' dan bile once calisir");
	}
	//eger birden fazla statik blok varsa Java yukaridakini daha once calistirir

}
