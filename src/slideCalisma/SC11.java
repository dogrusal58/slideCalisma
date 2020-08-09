package slideCalisma;

import java.util.Scanner;

public class SC11 {

	public static void main(String[] args) {
		//for loop döngüsü
		int i;// int ifadesini for un içine de alabilirdik for(int i =4;...
		
		for(i =4;i>1;i--) {
			System.out.println(i);
			
/*Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde 
biten tüm tamsayýlarý ekrana yazdýrýn.*/

			Scanner scan =new Scanner(System.in);
			int bas,bit ;
			
			System.out.println("baþlangýç deðerini giriniz : ");
			bas =scan.nextInt();
			
			System.out.println("bitiþ deðerini giriniz : ");
			bit =scan.nextInt();
			 
			int j ;
			for(j = 0;j<bit-bas+1;j++) {
				System.out.println(bas+j);
			}
			
			scan.close();
		}

	}

}
