package slideCalisma;

import java.util.Scanner;

public class SC092 {

	public static void main(String[] args) {
		//Kullan�c�dan iki tamsay� girmesini isteyin, ekrana her zaman b�y�k olan�n� yazd�r�n

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Birinci tam say�y� giriniz : ");
		int num1 = scan.nextInt();
		
		System.out.println("�kinci tam say�y� giriniz : ");
		int num2 = scan.nextInt();
		
		String result = num1 > num2 ? "b�y�k say� birinci girdi�iniz" : "b�y�k say� ikinci girdi�iniz" ;
		System.out.println(result);
		scan.close();

	}

}
