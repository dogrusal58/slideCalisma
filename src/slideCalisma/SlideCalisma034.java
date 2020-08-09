package slideCalisma;

import java.util.Scanner;

public class SlideCalisma034 {

	public static void main(String[] args) {
		// kullanýcýdan karenin bir kenarýný isteyin sonra alan ve çevresini bulduran programý yazýn
		Scanner scan =new Scanner(System.in);
		System.out.println("karenin bir kenar uzunluðunu giriniz");
		float a =scan.nextFloat();
		float alan=a*a;
		float cevre =4*a;
System.out.println("Alan " + "= " + alan);
System.out.println("Çevre " + "= " + cevre);
scan.close();
	}

}
