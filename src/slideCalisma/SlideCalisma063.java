package slideCalisma;

import java.util.Scanner;

public class SlideCalisma063 {

	public static void main(String[] args) {
		// kullan�c�dan ald���m�z g�n 3 dinin kutsal g�nlerinden biri ise yazd�r�n
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir g�n giriniz : ");
		String day =scan.nextLine();
		
		String d1 = "cuma";
		String d2 = "cumartesi";
		String d3 = "pazar";
		//stringleri equals ile e�itledi�imizi unutma.
		
		if(day.equals(d1)) {
			System.out.println("m�sl�manlar i�in kutsal g�n");
			
		}else if(day.equals(d2)) {
			System.out.println("hristiyanlar i�in kutsal g�n");
			
		}else if(day.equals(d3)) {
			System.out.println("museviler i�in kutsal g�n");
			
		}else {
			System.out.println("tan�ml� g�n de�il");
			
		}
		scan.close();
		

	}

}
