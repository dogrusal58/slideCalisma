package slideCalisma;

import java.util.Scanner;

public class SC102 {

	public static void main(String[] args) {
		// Kullan�c�dan kredi kart� numaras�n� al�n ve bu numaran�n ���nc�, d�rd�nc� ve sonuncu 
		//rakamlar�n� ekrana yazd�r�n.
	Scanner scan = new Scanner(System.in);
	System.out.println("16 haneli bir numara giriniz : ");
	String cno =scan.nextLine();
	
	System.out.println(cno.charAt(2));
	System.out.println(cno.charAt(3));
	System.out.println(cno.charAt(18));
	System.out.println(cno.length());
	scan.close();
	
	
	}

}
