package slideCalisma;

import java.util.Scanner;

public class SC103 {

	public static void main(String[] args) {
// Kullan�c�dan ya�ad��� �lkenin ismini al�n bu �lkenin ismi Amerika ise ekrana USA, Ingiltere ise
//ekrana UK, Almanya ise ekrana DE yazd�r�n. Di�er �lkeler i�in ise NA yazd�r�n. 

       Scanner scan = new Scanner(System.in);
       System.out.println("Bir �lke ismi giriniz : ");
       String ulke = scan.nextLine().toLowerCase() ;    
       
       switch(ulke) {
       
       case "Amerika" :
    	   System.out.println("USA");
    	   break;
    	   
       case "�ngiltere" :
    	   System.out.println("UK");
    	   break;
    	   
       case "Almanya" :
    	   System.out.println("DE");
    	   break;
    	   
       default :
    	   System.out.println("NA");
    		   
       }
       scan.close();
       
			
	}

}
