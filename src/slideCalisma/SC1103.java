package slideCalisma;

import java.util.Scanner;

public class SC1103 {

	public static void main(String[] args) {
//Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden veya sonrasýndan  
//baþlayýp bitiþ deðerinde veya öncesinde biten tüm 3 ile bölünebilen tamsayýlarý ekrana yazdýrýn.
		
		
		Scanner scan =new Scanner(System.in);
		int bas,bit ;
		
		System.out.println("baþlangýç deðerini giriniz : ");
		bas =scan.nextInt();
		
		System.out.println("bitiþ deðerini giriniz : ");
		bit =scan.nextInt();
         
		int j;
		for(j=0;j<=bit-bas;j++) { 
			if((bas+j)%3==0) {System.out.print(bas+j+",");
		}
			
		}
		scan.close();
	}

}
