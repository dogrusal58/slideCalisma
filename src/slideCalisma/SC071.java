package slideCalisma;

import java.util.Scanner;

public class SC071 {

	public static void main(String[] args) {
		//kullan�c�dan notunu al�n ve a�a��daki kurallara g�re A,B,C ve D yazd�r�n
		//NOT<50 D,50<=NOT<60 C,60<=NOT<80 B,80<=NOT<=100 A
		
		Scanner scan = new Scanner(System.in);
		System.out.println("��renci notunu giriniz : ");
		int not = scan.nextInt();
		if(not<0 || not >100) {
			System.out.println("Yanl�� de�er girdiniz ");
		}
		else if(not>=0 && not<50) {
			System.out.println("��renci notu D " );
			
		}else if(not<60) {
			System.out.println("��renci notu C ");
		}else if(not<80) {
			System.out.println("��renci notu B ");
			
		}else {
			System.out.println("��renci notu A ");
			
		}
		
		scan.close();
		
		
		
		
	}

}
