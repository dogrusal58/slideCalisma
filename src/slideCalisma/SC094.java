package slideCalisma;

import java.util.Scanner;

public class SC094 {

	public static void main(String[] args) {
		/*
		  Kullan�c�dan bir tamsay� girmesini isteyin, o tamsay� 3 basamakl� ise ekrana 
		�3 Basamakl�� yazd�r�n.
		3 basamakl� degilse �ift olup olmadigini kontrol edin. 
		�ift ise �3 basamakl� olmayan �ift say�� yazd�r�n.
		�ift say� degilse �3 basamakl� olmayan tek say� yazd�r�n.�
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam say� giriniz : ");
		int n = scan.nextInt();
		
		String result = (n>=100 && n<=999) ? "3 Basamakl� say�" : 
			(n%2==0) ? "3 basamakl� olmayan �ift say�" : "3 basamakl� olmayan tek say�" ;
        System.out.println(result);
        scan.close();
	}

}
