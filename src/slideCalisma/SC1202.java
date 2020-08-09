package slideCalisma;

import java.util.Scanner;

public class SC1202 {

	public static void main(String[] args) {
// Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn ve baþlangýç deðerinden
//baþlayýp bitiþ deðerinde biten tüm tamsayýlarý while loop kullanarak ekrana yazdýrýnýz.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("baþlangýç deðerini giriniz :");
		int bas =scan.nextInt();
		
		System.out.println("bitiþ deðerini giriniz : ");
		int bit = scan.nextInt();
      
		int i =0;
		while(i<=bit-bas) {
			System.out.print(bas+i+" ");
			i++;
		}
		
		
	}

}
