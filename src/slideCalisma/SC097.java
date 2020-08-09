package slideCalisma;

import java.util.Scanner;

public class SC097 {

	public static void main(String[] args) {
		// Kullanýcýdan bir harf alalým.a veya A ise ilk harf b veya B ise
		// ikinci harf,c veya C ise 3. harf ,diðer durumlarda tanýmlanamadý yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir harf giriniz : ");
		char ch = scan.next().charAt(0);
		
		if(ch=='a' || ch=='A') { 
			System.out.println("ilk harfi girdiniz ");
			
		}else if(ch=='b' || ch=='B') {
			System.out.println("ikinci harfi girdiniz");
			
		}else if(ch=='c' || ch=='C') {
			System.out.println("üçüncü harfi girdiniz");
			
		}else {
			System.out.println("tanýmlý deðil");
			
		}
scan.close();
	}

}
