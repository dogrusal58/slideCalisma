package slideCalisma;

import java.util.Scanner;

public class SlideCalisma068 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir karakter giriniz : ");
		char ch =scan.next().charAt(0);
		if(ch>='a' && ch<='z') {
			System.out.println("Küçük harf girdiniz");
			
		}else if(ch>='A' && ch <='Z') {
			System.out.println("Büyük harf girdiniz");
		}else {
			System.out.println("tanýmlanamayan karakter girdiniz");
			
		}
scan.close();
	}

}
