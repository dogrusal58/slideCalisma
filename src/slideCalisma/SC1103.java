package slideCalisma;

import java.util.Scanner;

public class SC1103 {

	public static void main(String[] args) {
//Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden veya sonras�ndan  
//ba�lay�p biti� de�erinde veya �ncesinde biten t�m 3 ile b�l�nebilen tamsay�lar� ekrana yazd�r�n.
		
		
		Scanner scan =new Scanner(System.in);
		int bas,bit ;
		
		System.out.println("ba�lang�� de�erini giriniz : ");
		bas =scan.nextInt();
		
		System.out.println("biti� de�erini giriniz : ");
		bit =scan.nextInt();
         
		int j;
		for(j=0;j<=bit-bas;j++) { 
			if((bas+j)%3==0) {System.out.print(bas+j+",");
		}
			
		}
		scan.close();
	}

}
