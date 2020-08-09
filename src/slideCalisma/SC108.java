package slideCalisma;

import java.util.Scanner;

public class SC108 {

	public static void main(String[] args) {
// Kullanıcıdan ilk ve soy ismini alın ilk ve soy isminin ilk harﬂerini 
//büyük harf olarak ekrana yazdırın.
		Scanner scan = new Scanner(System.in);
		String ad,soyad;
		System.out.println("adınızı giriniz : ");
		ad =scan.nextLine();
		
		System.out.println("soyadınızı giriniz : ");
		soyad =scan.nextLine();
		
		System.out.println(ad.toUpperCase().charAt(0) +ad.toLowerCase().substring(1, ad.length())+ " " + 
		soyad.toUpperCase().charAt(0)+ soyad.toLowerCase().substring(1, soyad.length()));
		scan.close();
		
		
		

	}

}
