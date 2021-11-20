package day04_increment_decrement;

public class C06_PreIncrementPostIncrement {

	public static void main(String[] args) {
	
		//preIncrement ve post Increment sadece sayi++ veya sayi-- yazimi icin gecerlidir
		
		int sayi=10;
		
		sayi++;
		sayi++;
		sayi++;
		
		System.out.println(sayi); // 13 
		
		System.out.println(sayi++); // bu satirda iki islem var
									//bir artirma, bir de yazdirma
		
		//once artirmak sonra yazdirmak isterseniz ++sayi
		//once yazdirmak sonra artirmak isterseniz sayi++
		
		System.out.println(sayi); //14
		
		System.out.println(++sayi);//15
		
		System.out.println(sayi);
		
	}

}
