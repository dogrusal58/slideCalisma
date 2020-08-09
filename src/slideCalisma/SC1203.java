package slideCalisma;

import java.util.Scanner;

public class SC1203 {

	public static void main(String[] args) {
// Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn ve baþlangýç
//deðerinden veya sonrasýndan baþlayýp bitiþ deðerinde veya
//öncesinde biten tüm çift tamsayýlarý while loop kullanarak ekrana yazdýrýnýz.

         Scanner scan = new Scanner(System.in);
		
		System.out.println("baþlangýç deðerini giriniz :");
		int bas =scan.nextInt();
		
		System.out.println("bitiþ deðerini giriniz : ");
		int bit = scan.nextInt();
      
		int i =0;
		while(i<=bit-bas) {
			if((bas+i)%2==0) {
				System.out.print(bas+i + " ");
				
			}
			i++;
		}
		
		scan.close();
		
	}

}
