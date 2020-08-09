package slideCalisma;

import java.util.Scanner;

public class SC094 {

	public static void main(String[] args) {
		/*
		  Kullanýcýdan bir tamsayý girmesini isteyin, o tamsayý 3 basamaklý ise ekrana 
		“3 Basamaklý” yazdýrýn.
		3 basamaklý degilse çift olup olmadigini kontrol edin. 
		Çift ise “3 basamaklý olmayan çift sayý” yazdýrýn.
		Çift sayý degilse “3 basamaklý olmayan tek sayý yazdýrýn.”
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam sayý giriniz : ");
		int n = scan.nextInt();
		
		String result = (n>=100 && n<=999) ? "3 Basamaklý sayý" : 
			(n%2==0) ? "3 basamaklý olmayan çift sayý" : "3 basamaklý olmayan tek sayý" ;
        System.out.println(result);
        scan.close();
	}

}
