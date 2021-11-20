package day04_increment_decrement;

import java.util.Scanner;

public class C01_Scanner {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen cemberin yaricapini giriniz...:");
		
		double yaricap=scan.nextDouble();
		
		double pi=Math.PI;
		
		double cevre=yaricap*pi*2;
		
		double alan=yaricap*yaricap*pi;
		
		System.out.println("cember cevresi...:" + cevre);

		System.out.println("dairenin alani...:" + alan);
		
		scan.close();

	}

}
