package slideCalisma;

import java.util.Scanner;

public class SlideCalisma065 {

	public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);
     System.out.println("birinci kenarý giriniz");
     int a = scan.nextInt();
     
     System.out.println("ikinci kenarý giriniz");
     int b = scan.nextInt();
     
     System.out.println("üçüncü kenarý giriniz");
     int c = scan.nextInt();
     
     if(a==b && b==c) {
    	 System.out.println("eþkenar üçgen");
    	 
     }else {
    	 System.out.println("eþkenar üçgen deðil");
    	 
     }
     scan.close();
     
	}

}
