package slideCalisma;

import java.util.Scanner;

public class SC1102 {

	public static void main(String[] args) {
// Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n ve ba�lang�� de�erinden veya sonras�ndan  
//ba�lay�p biti� de�erinde veya �ncesinde  biten t�m �ift tamsay�lar� ekrana yazd�r�n
		Scanner scan =new Scanner(System.in);
		int bas,bit ;
		
		System.out.println("ba�lang�� de�erini giriniz : ");
		bas =scan.nextInt();
		
		System.out.println("biti� de�erini giriniz : ");
		bit =scan.nextInt();
		
		int j ;
		for(j = 0;j<bit-bas+1;j++) {
			if((bas+j)%2==0) {
				System.out.println(bas+j);
			}
			
		}
		
		scan.close();
		
		
		
		
		
		
	}

}
