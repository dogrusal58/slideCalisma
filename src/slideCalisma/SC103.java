package slideCalisma;

import java.util.Scanner;

public class SC103 {

	public static void main(String[] args) {
// Kullanýcýdan yaþadýðý ülkenin ismini alýn bu ülkenin ismi Amerika ise ekrana USA, Ingiltere ise
//ekrana UK, Almanya ise ekrana DE yazdýrýn. Diðer ülkeler için ise NA yazdýrýn. 

       Scanner scan = new Scanner(System.in);
       System.out.println("Bir ülke ismi giriniz : ");
       String ulke = scan.nextLine().toLowerCase() ;    
       
       switch(ulke) {
       
       case "Amerika" :
    	   System.out.println("USA");
    	   break;
    	   
       case "Ýngiltere" :
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
