package day10_ternary_SwitchCase;

public class C05_NestedTernary {

	public static void main(String[] args) {
		
		// Eğer çalışan kadınsa 60 yaşından büyük olduğunda emekli olabilir,
				// Çalışan erkekse 65 yaşından büyükse emekli olabilir.
		
		
		//her seferinde scanner olusturmak yerine test datalarimizi variable olarakta olusturabiliriz
		//ve kod yazimi bittiginde bu test datalarini degistirerek kodlarimizi test edebiliriz
		
		
		char cinsiyet='K';
		int yas=66;
		
		String sonuc=cinsiyet=='K' ? (yas>=60 ? "Emekli olabilirsin" :"Emekli olamazsin"):
						(yas>=65 ? "Emekli olabilirsin" :"Emekli olamazsin");
		

		System.out.println(sonuc);
	}

}
