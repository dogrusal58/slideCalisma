package slideCalisma;

import java.util.Scanner;

public class SlideCalisma034 {

	public static void main(String[] args) {
		// kullan�c�dan karenin bir kenar�n� isteyin sonra alan ve �evresini bulduran program� yaz�n
		Scanner scan =new Scanner(System.in);
		System.out.println("karenin bir kenar uzunlu�unu giriniz");
		float a =scan.nextFloat();
		float alan=a*a;
		float cevre =4*a;
System.out.println("Alan " + "= " + alan);
System.out.println("�evre " + "= " + cevre);
scan.close();
	}

}
