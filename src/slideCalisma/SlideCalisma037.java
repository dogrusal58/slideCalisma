package slideCalisma;

import java.util.Scanner;

public class SlideCalisma037 {

	public static void main(String[] args) {
		//kullanýcýdan aldýðýnýz mili kilometreye çeviren program
		//1 mil = 1.6 km
		Scanner scan = new Scanner(System.in);
		System.out.println("Kaç mil ? ");
		double mil = scan.nextDouble();
		double snc = mil*1.6;
		System.out.println("Sonuç "+"= "+snc);
		scan.close();

	}

}
