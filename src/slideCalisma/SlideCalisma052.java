package slideCalisma;

import java.util.Scanner;

public class SlideCalisma052 {

	public static void main(String[] args) {
		// kullan�c�n�n girdi�i 7 basamakl� bir say�n�n ilk �� ve son iki rakamlar�n�n toplam�n� yazd�ran program.
		Scanner scan = new Scanner(System.in);
		System.out.println("7 basamakl� bir say� giriniz : ");
		long num =scan.nextLong();
		long ilk_uc= num/10000;
		long son_iki =num%100;
		long top = ilk_uc+son_iki;
		System.out.println("Toplam = "+ top);
		scan.close();

	}

}
