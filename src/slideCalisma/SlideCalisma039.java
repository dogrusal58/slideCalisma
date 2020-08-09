package slideCalisma;

import java.util.Scanner;

public class SlideCalisma039 {

	public static void main(String[] args) {
		// kullanýcýdan aldýðýmýz saati saniyeye çeviriniz
		Scanner scan = new Scanner(System.in);
		System.out.println("Saati giriniz    : ");
		byte saat = scan.nextByte();
		System.out.println("Dakikayý giriniz : ");
		byte dk =scan.nextByte();
        float sny= saat*60*60+dk*60;
        System.out.println(saat+" saat "+ "ve " +dk+" dakika"+" = "+sny+" saniyedir.");
		scan.close();

	}

}
