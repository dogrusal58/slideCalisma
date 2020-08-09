package slideCalisma;

import java.util.Scanner;

public class SlideCalisma052 {

	public static void main(String[] args) {
		// kullanýcýnýn girdiði 7 basamaklý bir sayýnýn ilk üç ve son iki rakamlarýnýn toplamýný yazdýran program.
		Scanner scan = new Scanner(System.in);
		System.out.println("7 basamaklý bir sayý giriniz : ");
		long num =scan.nextLong();
		long ilk_uc= num/10000;
		long son_iki =num%100;
		long top = ilk_uc+son_iki;
		System.out.println("Toplam = "+ top);
		scan.close();

	}

}
