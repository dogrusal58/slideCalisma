package slideCalisma;

import java.util.Scanner;

public class SC096 {

	public static void main(String[] args) {
		// Switch case
		/*
Kullan�c�dan bir gun al�n e�er gun �Cuma� ise ekrana �M�sl�manlar i�in kutsal g�n� yazd�r�n.
�Cumartesi� ise ekrana �Yahudiler i�in kutsal g�n� yazd�r�n. �Pazar� ise ekrana 
�H�ristiyanlar i�in kutsal g�n� yazd�r�n. Diler g�nler icin �Kutsal g�n de�il� yazd�r�n.
*/

		 Scanner kutsal_gun =new Scanner(System.in);
		 System.out.println("Bir g�n giriniz : ");
		 String gun =kutsal_gun.nextLine();
		 
		 
		 
		 switch(gun) {
		 
		 case "cuma " :
			 System.out.println("M�sl�manlar i�in kutsal g�n : ");
			 break;
		 case  "cumartesi" : 
			 System.out.println("Museviler i�in kutsal g�n : ");
			 break;
		 case  "pazar" :
		     System.out.println("Hristiyanlar i�in kutsal g�n : ");
		     break;
		 default :
		    	 System.out.println("Di�er g�nler : ");
		 }
	}
}
		  