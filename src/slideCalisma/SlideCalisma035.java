package slideCalisma;

import java.util.Scanner;

public class SlideCalisma035 {

	public static void main(String[] args) {
		// kullan�c�dan al�nan bir say�n�n k�b�n� hesaplayal�m.
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir say� giriniz :");
		double a =scan.nextDouble();
		double sonuc_kub = a*a*a;
		System.out.println("Say�n�n k�b� "+ "="+" " +sonuc_kub);
		scan.close();
		

	}

}
