package slideCalisma;

import java.util.Scanner;

public class SC1105 {

	public static void main(String[] args) {
//Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n ve ba�lang�� de�erinden ba�lay�p
//biti� de�erinde biten t�m tamsay�lar�n �arp�m�n� ekrana yazd�r�n.

		Scanner scan =new Scanner(System.in);
		int bas,bit ;
		
		System.out.println("ba�lang�� de�erini giriniz : ");
		bas =scan.nextInt();
		
		System.out.println("biti� de�erini giriniz : ");
		bit =scan.nextInt();
		
		int carp = 1;
		for(int j=bas;j<=bit;j++) {
			carp=carp*j;
		}
		System.out.println(carp);
		scan.close();
		
	}

}
