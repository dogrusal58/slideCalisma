package slideCalisma;

import java.util.Scanner;

public class SlideCalisma066 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	     System.out.println("birinci kenar� giriniz");
	     int a = scan.nextInt();
	     
	     System.out.println("ikinci kenar� giriniz");
	     int b = scan.nextInt();
	     
	     System.out.println("���nc� kenar� giriniz");
	     int c = scan.nextInt();
	     
	     if(a+b>c && a-b<c && a+c>b && a-c<b && b+c>a && b-c<a) {
	    	 if(a==b && b==c) {
	    		 System.out.println("e�kenar ��gen");
	    		 
	    	 }else {
	    		 System.out.println("��gen fakat e�kenar de�il");
	    		 
	    	 }
	     }else if (a<0 || b<0 || c<0){
	    	 System.out.println("negatif say� giremezsiniz");
	    	 
	     }else {
	    	 System.out.println("��gen de�il");
	     }
    	 
    	 
	     scan.close();

	}

}
