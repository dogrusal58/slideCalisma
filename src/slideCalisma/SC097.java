package slideCalisma;

import java.util.Scanner;

public class SC097 {

	public static void main(String[] args) {
		// Kullan�c�dan bir harf alal�m.a veya A ise ilk harf b veya B ise
		// ikinci harf,c veya C ise 3. harf ,di�er durumlarda tan�mlanamad� yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir harf giriniz : ");
		char ch = scan.next().charAt(0);
		
		if(ch=='a' || ch=='A') { 
			System.out.println("ilk harfi girdiniz ");
			
		}else if(ch=='b' || ch=='B') {
			System.out.println("ikinci harfi girdiniz");
			
		}else if(ch=='c' || ch=='C') {
			System.out.println("���nc� harfi girdiniz");
			
		}else {
			System.out.println("tan�ml� de�il");
			
		}
scan.close();
	}

}
