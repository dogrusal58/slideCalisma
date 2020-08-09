package slideCalisma;

import java.util.Scanner;

public class SC085 {

	public static void main(String[] args) {
		// TERNARY
		Scanner input = new Scanner(System.in);
		System.out.println("ürünün birim fiyatýný giriniz : ");
		float bf = input.nextFloat();
		
		System.out.println("ürünün miktarýný giriniz      : ");
		int um = input.nextInt();
		
		float ind_f = bf*um*0.9f ;
		float top_f = bf*um ;
		String result = um>1000 ? "Ýndirimli Fiyat = " + ind_f : "Toplam Fiyat    = " + top_f ;
		System.out.println(result);
input.close();
	

	}

}
