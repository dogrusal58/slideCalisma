package slideCalisma;

import java.util.Scanner;

public class SlideCalisma067 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�r�n�n birim fiyat�n� giriniz : ");
		float bf = input.nextFloat();
		
		System.out.println("�r�n�n miktar�n� giriniz      : ");
		int um = input.nextInt();
		
		float ind_f = bf*um*0.9f ;
		float top_f = bf*um ;
		if(um>1000) {
			System.out.println("�ndirimli Fiyat = " + ind_f);
		
		}else {
			System.out.println("Toplam Fiyat    = " + top_f );
			
		}
input.close();
	}

}
