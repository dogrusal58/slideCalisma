package slideCalisma;

import java.util.Scanner;

public class SlideCalisma065 {

	public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);
     System.out.println("birinci kenar� giriniz");
     int a = scan.nextInt();
     
     System.out.println("ikinci kenar� giriniz");
     int b = scan.nextInt();
     
     System.out.println("���nc� kenar� giriniz");
     int c = scan.nextInt();
     
     if(a==b && b==c) {
    	 System.out.println("e�kenar ��gen");
    	 
     }else {
    	 System.out.println("e�kenar ��gen de�il");
    	 
     }
     scan.close();
     
	}

}
