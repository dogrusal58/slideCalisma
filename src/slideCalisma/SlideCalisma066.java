package slideCalisma;

import java.util.Scanner;

public class SlideCalisma066 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	     System.out.println("birinci kenarý giriniz");
	     int a = scan.nextInt();
	     
	     System.out.println("ikinci kenarý giriniz");
	     int b = scan.nextInt();
	     
	     System.out.println("üçüncü kenarý giriniz");
	     int c = scan.nextInt();
	     
	     if(a+b>c && a-b<c && a+c>b && a-c<b && b+c>a && b-c<a) {
	    	 if(a==b && b==c) {
	    		 System.out.println("eþkenar üçgen");
	    		 
	    	 }else {
	    		 System.out.println("üçgen fakat eþkenar deðil");
	    		 
	    	 }
	     }else if (a<0 || b<0 || c<0){
	    	 System.out.println("negatif sayý giremezsiniz");
	    	 
	     }else {
	    	 System.out.println("üçgen deðil");
	     }
    	 
    	 
	     scan.close();

	}

}
