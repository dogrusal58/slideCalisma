package slideCalisma;

import java.util.Scanner;

public class SlideCalisma051 {

	public static void main(String[] args) {
		// kullanýcýnýn girdiði 5 basamaklý bir sayýnýn rakamlarý toplamýný yazdýran program.
		Scanner scan = new Scanner(System.in);
		System.out.println("5 basamaklý bir sayý giriniz : ");
		int num =scan.nextInt();
		int r1 =num%10;
		int r2=(num/10)%10;
		int r3=(num/100)%10;
		int r4=(num/1000)%10;
		int r5=(num/10000)%10;
		int toplam = r1+r2+r3+r4+r5 ;
		System.out.println("Rakamlar toplamý = " + toplam);
		scan.close();
		

	}

}
