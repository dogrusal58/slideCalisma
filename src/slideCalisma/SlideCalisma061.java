package slideCalisma;

import java.util.Scanner;

public class SlideCalisma061 {

	public static void main(String[] args) {
		// e�er kullan�c�dan al�nan say� ��e b�l�nebiliyorsa 3 �n kat� yazd�r�n 
		//b�l�nemiyorsa 3�n kat� de�il yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
      //Scanner input =new Scanner(System.in); de olur
		System.out.println("Bir say� giriniz : ");
		int number = scan.nextInt();//int number = input.nextInt(); de olurdu.
		if(number%3==0) {
			System.out.println("Say� ���n kat�d�r.");
			
		} if(number%3!=0) {
			System.out.println("say� ���n kat� de�ildir");
			
		}
scan.close();
	}

}
