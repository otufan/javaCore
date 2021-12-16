package day43_Interface;

public class C03_Concrete implements C02_Interface{

	public static void main(String[] args) {
		
		
		C03_Concrete concreteObje=new C03_Concrete();
		
		
		//Interface de default keywort kullanarak olusturdugumuz body si olan methodlara 
		//child concrete class lardan obje vasitasiyla ulasabilirim
		concreteObje.kaporta();
		
		
		//static keywort ile olusturdugumuzda ise child class tan interface ismi vasitasiyla ulasabilirim 
		C02_Interface.sanzuman();
	}

	//bir interface de static veya default keyword kullanarak body si olan bir method olusturursak 
	//bu interface e implements eden concrute child class lar bu methodlari 
	//implement etmek zorunda degildir
	@Override
	public void motor() {
		// TODO Auto-generated method stub
		
	}

}
