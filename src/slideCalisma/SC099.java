package slideCalisma;

import java.util.Scanner;

public class SC099 {

	public static void main(String[] args) {
/* 
 Kullan�c�dan bir tamsay� al�n e�er tamsay� 9 ise ekrana �Bir basamakl� en b�y�k say�� yazd�r�n.
99 ise ekrana ��ki basamakl� en b�y�k say�� yazd�r�n.
999 ise ekrana ��� basamakl� en b�y�k say�� yazd�r�n.
Bu say�lar�n d���ndaki say�lar i�in �Yorum yok� yazd�r�n.
*/
      Scanner scan = new Scanner(System.in);
      System.out.println("Bir tam say� giriniz : ");
      int n = scan.nextInt();
      
      switch(n) {
      case 9  :
    	  System.out.println("en b�y�k rakam");
    	  break;
      case 99 :
    	  System.out.println("en b�y�k iki basamakl� say�");
    	  break;
      case 999 :
    	  System.out.println("en b�y�k �� basamakl� say�");
    	  break;
      default :
    	  System.out.println("tan�ml� de�il");
      }
		scan.close();
		
	}

}
