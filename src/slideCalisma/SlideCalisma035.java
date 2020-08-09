package slideCalisma;

import java.util.Scanner;

public class SlideCalisma035 {

	public static void main(String[] args) {
		// kullanýcýdan alýnan bir sayýnýn kübünü hesaplayalým.
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayý giriniz :");
		double a =scan.nextDouble();
		double sonuc_kub = a*a*a;
		System.out.println("Sayýnýn kübü "+ "="+" " +sonuc_kub);
		scan.close();
		

	}

}
