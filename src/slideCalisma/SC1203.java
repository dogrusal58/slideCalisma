package slideCalisma;

import java.util.Scanner;

public class SC1203 {

	public static void main(String[] args) {
// Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n ve ba�lang��
//de�erinden veya sonras�ndan ba�lay�p biti� de�erinde veya
//�ncesinde biten t�m �ift tamsay�lar� while loop kullanarak ekrana yazd�r�n�z.

         Scanner scan = new Scanner(System.in);
		
		System.out.println("ba�lang�� de�erini giriniz :");
		int bas =scan.nextInt();
		
		System.out.println("biti� de�erini giriniz : ");
		int bit = scan.nextInt();
      
		int i =0;
		while(i<=bit-bas) {
			if((bas+i)%2==0) {
				System.out.print(bas+i + " ");
				
			}
			i++;
		}
		
		scan.close();
		
	}

}
