package day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_FileInputStream {

	public static void main(String[] args) throws FileNotFoundException {
		// Java da bir dosyaya ulasmak istedigimizde FileInputStream class indan yardim aliriz

		
		FileInputStream fis = new FileInputStream("src\\day40\\yazi.txt");
		
		//java bu kodda olasi bir problem ongoruyor ve bu probleme karsi ne yapmasi gerektigini bize soruyor
		//yani alti cizilen her kod cte degildir
		
		//Bunun icin iki durum soz konusu
		//1- try, catch kullanarak bu problemi handeln ederek java nin yoluna devam etmesini saglayabiliriz
		//2- Eger dosya okunamiyorsa kod calismasin istiyorsak olayin farkinda oldugumuzu 
		// ve sorumlulugun bizde oldugunu Java ya soylemeliyiz
		
		System.out.println("Gorev tamamlandi");
		
	}

}
