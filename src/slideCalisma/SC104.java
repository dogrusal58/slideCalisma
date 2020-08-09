package slideCalisma;

import java.util.Scanner;

public class SC104 {

	public static void main(String[] args) {
//Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin bastan ikinci harﬁ ile sondan ikinci harﬁni 
// büyük harf olarak ekrana yazdırın. 
		  Scanner scan = new Scanner(System.in);
	      System.out.println("Bir ülke ismi giriniz : ");
	      String ulke = scan.nextLine() ; 
	      System.out.println(ulke.toLowerCase().substring(0,1)+ulke.toUpperCase().charAt(1) + ulke.toLowerCase().substring(2, ulke.length()-2)
	    		+ulke.toUpperCase().charAt(ulke.length()-2)+ulke.toLowerCase().charAt(ulke.length()-1)  );
	       
	      scan.close();
	}

}
