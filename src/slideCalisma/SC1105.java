package slideCalisma;

import java.util.Scanner;

public class SC1105 {

	public static void main(String[] args) {
//Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn ve baþlangýç deðerinden baþlayýp
//bitiþ deðerinde biten tüm tamsayýlarýn çarpýmýný ekrana yazdýrýn.

		Scanner scan =new Scanner(System.in);
		int bas,bit ;
		
		System.out.println("baþlangýç deðerini giriniz : ");
		bas =scan.nextInt();
		
		System.out.println("bitiþ deðerini giriniz : ");
		bit =scan.nextInt();
		
		int carp = 1;
		for(int j=bas;j<=bit;j++) {
			carp=carp*j;
		}
		System.out.println(carp);
		scan.close();
		
	}

}
