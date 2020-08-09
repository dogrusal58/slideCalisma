package slideCalisma;

import java.util.Scanner;

public class SlideCalisma038 {

	public static void main(String[] args) {
		/* Kullanýcýdan "*" sembolü alýp  *
		 *                               * *
		                                * * * oluþturun */
Scanner scan = new Scanner(System.in);
System.out.println("bir sembol giriniz");
char ch =scan.next().charAt(0);
System.out.println("SONUÇ : "+"\n"+"  "+ch+"\n"+" "+ch+" "+ch+"\n"+ch+" "+ch+" "+ch);
scan.close();
	}

}
