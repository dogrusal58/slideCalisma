package slideCalisma;

import java.util.Scanner;

public class SlideCalisma039 {

	public static void main(String[] args) {
		// kullan�c�dan ald���m�z saati saniyeye �eviriniz
		Scanner scan = new Scanner(System.in);
		System.out.println("Saati giriniz    : ");
		byte saat = scan.nextByte();
		System.out.println("Dakikay� giriniz : ");
		byte dk =scan.nextByte();
        float sny= saat*60*60+dk*60;
        System.out.println(saat+" saat "+ "ve " +dk+" dakika"+" = "+sny+" saniyedir.");
		scan.close();

	}

}
