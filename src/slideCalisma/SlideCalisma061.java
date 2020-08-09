package slideCalisma;

import java.util.Scanner;

public class SlideCalisma061 {

	public static void main(String[] args) {
		// eðer kullanýcýdan alýnan sayý üçe bölünebiliyorsa 3 ün katý yazdýrýn 
		//bölünemiyorsa 3ün katý deðil yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
      //Scanner input =new Scanner(System.in); de olur
		System.out.println("Bir sayý giriniz : ");
		int number = scan.nextInt();//int number = input.nextInt(); de olurdu.
		if(number%3==0) {
			System.out.println("Sayý üçün katýdýr.");
			
		} if(number%3!=0) {
			System.out.println("sayý üçün katý deðildir");
			
		}
scan.close();
	}

}
