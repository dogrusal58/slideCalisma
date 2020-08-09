package slideCalisma;

import java.util.Scanner;

public class SlideCalisma067 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ürünün birim fiyatýný giriniz : ");
		float bf = input.nextFloat();
		
		System.out.println("ürünün miktarýný giriniz      : ");
		int um = input.nextInt();
		
		float ind_f = bf*um*0.9f ;
		float top_f = bf*um ;
		if(um>1000) {
			System.out.println("Ýndirimli Fiyat = " + ind_f);
		
		}else {
			System.out.println("Toplam Fiyat    = " + top_f );
			
		}
input.close();
	}

}
