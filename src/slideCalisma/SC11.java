package slideCalisma;

import java.util.Scanner;

public class SC11 {

	public static void main(String[] args) {
		//for loop d�ng�s�
		int i;// int ifadesini for un i�ine de alabilirdik for(int i =4;...
		
		for(i =4;i>1;i--) {
			System.out.println(i);
			
/*Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n ve ba�lang�� de�erinden ba�lay�p biti� de�erinde 
biten t�m tamsay�lar� ekrana yazd�r�n.*/

			Scanner scan =new Scanner(System.in);
			int bas,bit ;
			
			System.out.println("ba�lang�� de�erini giriniz : ");
			bas =scan.nextInt();
			
			System.out.println("biti� de�erini giriniz : ");
			bit =scan.nextInt();
			 
			int j ;
			for(j = 0;j<bit-bas+1;j++) {
				System.out.println(bas+j);
			}
			
			scan.close();
		}

	}

}
