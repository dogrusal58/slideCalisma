package slideCalisma;

import java.util.Scanner;

public class SC085 {

	public static void main(String[] args) {
		// TERNARY
		Scanner input = new Scanner(System.in);
		System.out.println("�r�n�n birim fiyat�n� giriniz : ");
		float bf = input.nextFloat();
		
		System.out.println("�r�n�n miktar�n� giriniz      : ");
		int um = input.nextInt();
		
		float ind_f = bf*um*0.9f ;
		float top_f = bf*um ;
		String result = um>1000 ? "�ndirimli Fiyat = " + ind_f : "Toplam Fiyat    = " + top_f ;
		System.out.println(result);
input.close();
	

	}

}
