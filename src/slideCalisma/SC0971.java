package slideCalisma;

import java.util.Scanner;

public class SC0971 {

	public static void main(String[] args) {
		//  Kullanýcýdan bir harf alalým.a veya A ise ilk harf b veya B ise
		// ikinci harf,c veya C ise 3. harf ,diðer durumlarda tanýmlanamadý yazdýrýn.
//önceki soruyu switc metodu ile çözüyoruz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir harf giriniz : ");
		char ch = scan.next().charAt(0);
		
		switch(ch) {
                  
		case 'a' :
			System.out.println("ilk harf");
			break;
		case 'A' :
			System.out.println("ilk harf");
			break;
			
		case 'b' :
			System.out.println("ikinci harf");
			break;
			
		case 'B' :
		    System.out.println("ikinci harf");
		    break;
		    
		case 'c' :
			System.out.println("üçüncü harf");
			break;
			
		case 'C' :
			System.out.println("üçüncü harf");
			break;
			
		default :
			System.out.println("tanýmlý deðil");
		
		}
		scan.close();
		
		
	}

}
