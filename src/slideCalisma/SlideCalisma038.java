package slideCalisma;

import java.util.Scanner;

public class SlideCalisma038 {

	public static void main(String[] args) {
		/* Kullan�c�dan "*" sembol� al�p  *
		 *                               * *
		                                * * * olu�turun */
Scanner scan = new Scanner(System.in);
System.out.println("bir sembol giriniz");
char ch =scan.next().charAt(0);
System.out.println("SONU� : "+"\n"+"  "+ch+"\n"+" "+ch+" "+ch+"\n"+ch+" "+ch+" "+ch);
scan.close();
	}

}
