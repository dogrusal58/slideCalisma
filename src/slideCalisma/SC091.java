package slideCalisma;

import java.util.Scanner;

public class SC091 {

	public static void main(String[] args) {
		/*
		Kullanýcýdan bir tamsayý girmesini isteyin, tamsayý çift ise ekrana “Çift” tek ise ekrana “Tek”
		yazdýrýn.
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam sayý giriniz : ");
		int num = scan.nextInt();
		
		System.out.println(num%2==0 ? "Çift sayý" : "Tek sayý");
		scan.close();

	}

}
