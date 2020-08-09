package slideCalisma;

import java.util.Scanner;

public class SC1106 {

	public static void main(String[] args) {
//Kullanıcıdan başlangıç ve bitiş  harﬂerini alın ve başlangıç harﬁnden başlayıp
//bitiş harﬁnde biten tüm harﬂeri büyük harf olarak ekrana yazdırın.
		Scanner scan =new Scanner(System.in);
		char bas,bit ;
		
		System.out.println("başlangıç harfini giriniz : ");
		bas =scan.next().charAt(0);
		
		System.out.println("bitiş harfini giriniz : ");
		bit =scan.next().charAt(0);
		
		
		for(int i=bas;i<=bit;i++) {
			System.out.println(bas+i);
		}
		
	}

}
