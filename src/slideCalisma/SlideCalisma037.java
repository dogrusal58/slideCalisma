package slideCalisma;

import java.util.Scanner;

public class SlideCalisma037 {

	public static void main(String[] args) {
		//kullan�c�dan ald���n�z mili kilometreye �eviren program
		//1 mil = 1.6 km
		Scanner scan = new Scanner(System.in);
		System.out.println("Ka� mil ? ");
		double mil = scan.nextDouble();
		double snc = mil*1.6;
		System.out.println("Sonu� "+"= "+snc);
		scan.close();

	}

}
