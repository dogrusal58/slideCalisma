package slideCalisma;

import java.util.Scanner;

public class SC105 {

	public static void main(String[] args) {
//Kullanıcıdan yaşadığı ülkenin ismini alın 
//bu ülkenin ilk iki harﬁni büyük harf olarak ekrana yazdırın.

		Scanner scan = new Scanner(System.in);
	    System.out.println("Bir ülke ismi giriniz : ");
	    String ulke = scan.nextLine() ;
	    
	    System.out.println(ulke.toUpperCase().substring(0, 2)+ulke.toLowerCase().substring(2, ulke.length()));
	
	
	
	}

}
