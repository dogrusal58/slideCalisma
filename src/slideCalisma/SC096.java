package slideCalisma;

import java.util.Scanner;

public class SC096 {

	public static void main(String[] args) {
		// Switch case
		/*
Kullanýcýdan bir gun alýn eðer gun “Cuma” ise ekrana “Müslümanlar için kutsal gün” yazdýrýn.
“Cumartesi” ise ekrana “Yahudiler için kutsal gün” yazdýrýn. “Pazar” ise ekrana 
“Hýristiyanlar için kutsal gün” yazdýrýn. Diler günler icin “Kutsal gün deðil” yazdýrýn.
*/

		 Scanner kutsal_gun =new Scanner(System.in);
		 System.out.println("Bir gün giriniz : ");
		 String gun =kutsal_gun.nextLine();
		 
		 
		 
		 switch(gun) {
		 
		 case "cuma " :
			 System.out.println("Müslümanlar için kutsal gün : ");
			 break;
		 case  "cumartesi" : 
			 System.out.println("Museviler için kutsal gün : ");
			 break;
		 case  "pazar" :
		     System.out.println("Hristiyanlar için kutsal gün : ");
		     break;
		 default :
		    	 System.out.println("Diðer günler : ");
		 }
	}
}
		  