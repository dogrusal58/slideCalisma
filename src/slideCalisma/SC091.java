package slideCalisma;

import java.util.Scanner;

public class SC091 {

	public static void main(String[] args) {
		/*
		Kullan�c�dan bir tamsay� girmesini isteyin, tamsay� �ift ise ekrana ��ift� tek ise ekrana �Tek�
		yazd�r�n.
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam say� giriniz : ");
		int num = scan.nextInt();
		
		System.out.println(num%2==0 ? "�ift say�" : "Tek say�");
		scan.close();

	}

}
