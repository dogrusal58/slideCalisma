package slideCalisma;

import java.util.Scanner;

public class SC0971 {

	public static void main(String[] args) {
		//  Kullan�c�dan bir harf alal�m.a veya A ise ilk harf b veya B ise
		// ikinci harf,c veya C ise 3. harf ,di�er durumlarda tan�mlanamad� yazd�r�n.
//�nceki soruyu switc metodu ile ��z�yoruz.
		
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
			System.out.println("���nc� harf");
			break;
			
		case 'C' :
			System.out.println("���nc� harf");
			break;
			
		default :
			System.out.println("tan�ml� de�il");
		
		}
		scan.close();
		
		
	}

}
