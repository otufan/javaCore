package day30_immutableClasses;

public class C02_Immutable {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		String str="Ali";
		
		for (int i = 0; i < 100; i++) {
			str+=" ";
		}
		
		//bu kod calistiginda Java kac obje olusturur
		
		/* bir obje basta olusturuldu loop da ise 100 obje daha olusuturldu
		 * dolayisiyla kod calisitirldiginda biz ekranda hic bir sey gormyeiz ama 
		 * Java 101 obje olusuturmus olur
		 * str in son degeri ise "Ali (100 bosluk) olur
		 */

	}

}
