package slideCalisma;

import java.util.Scanner;

public class SC099 {

	public static void main(String[] args) {
/* 
 Kullanýcýdan bir tamsayý alýn eðer tamsayý 9 ise ekrana “Bir basamaklý en büyük sayý” yazdýrýn.
99 ise ekrana “Ýki basamaklý en büyük sayý” yazdýrýn.
999 ise ekrana “Üç basamaklý en büyük sayý” yazdýrýn.
Bu sayýlarýn dýþýndaki sayýlar için “Yorum yok” yazdýrýn.
*/
      Scanner scan = new Scanner(System.in);
      System.out.println("Bir tam sayý giriniz : ");
      int n = scan.nextInt();
      
      switch(n) {
      case 9  :
    	  System.out.println("en büyük rakam");
    	  break;
      case 99 :
    	  System.out.println("en büyük iki basamaklý sayý");
    	  break;
      case 999 :
    	  System.out.println("en büyük üç basamaklý sayý");
    	  break;
      default :
    	  System.out.println("tanýmlý deðil");
      }
		scan.close();
		
	}

}
