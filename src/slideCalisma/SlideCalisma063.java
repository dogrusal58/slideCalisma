package slideCalisma;

import java.util.Scanner;

public class SlideCalisma063 {

	public static void main(String[] args) {
		// kullanýcýdan aldýðýmýz gün 3 dinin kutsal günlerinden biri ise yazdýrýn
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir gün giriniz : ");
		String day =scan.nextLine();
		
		String d1 = "cuma";
		String d2 = "cumartesi";
		String d3 = "pazar";
		//stringleri equals ile eþitlediðimizi unutma.
		
		if(day.equals(d1)) {
			System.out.println("müslümanlar için kutsal gün");
			
		}else if(day.equals(d2)) {
			System.out.println("hristiyanlar için kutsal gün");
			
		}else if(day.equals(d3)) {
			System.out.println("museviler için kutsal gün");
			
		}else {
			System.out.println("tanýmlý gün deðil");
			
		}
		scan.close();
		

	}

}
