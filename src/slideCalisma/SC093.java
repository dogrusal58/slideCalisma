package slideCalisma;

import java.util.Scanner;

public class SC093 {

	public static void main(String[] args) {
		// Kullanýcýdan bir tamsayý girmesini isteyin, ekrana o tamsayýnýn mutlak degerini yazdýrýn.
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tam sayý giriniz : ");
        int n = scan.nextInt();
        
        System.out.println(n<0 ? (-n) : (n)) ;
        scan.close();
		
		
	}

}
