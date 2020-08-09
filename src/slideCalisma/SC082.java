package slideCalisma;

import java.util.Scanner;

public class SC082 {

	public static void main(String[] args) {
		/*NESTED ÝF
		Kullanýcýdan password girmesini isteyin. 
		Girdiði password 5’e bölünüyorsa son rakamýný kontrol edin. Son rakamý 0 ise ekrana “5’e bölünen çift sayý” yazdýrýn.
		Son rakamý 0 deðil ise “5’e bölünen tek sayý” yazdýrýn.
		Girdiði password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdýrýn.
		*/
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayý giriniz : ");
        int num = scan.nextInt();
        
        if(num%5==0) {
        	if(num%10==0) {
        		System.out.println("5 e bölünen çift sayý");
        		
        	}else {
        		System.out.println("5 e bölünen tek sayý");
        		
        	}
        }
        else {System.out.println("sayý 5 e bölünmez");
        
        }

	}

}
