package slideCalisma;

import java.util.Scanner;

public class SlideCalisme033 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		   System.out.println("Adýnýz : ");
		   String ad =scan.nextLine();
		   
		   System.out.println("Soyadýnýz : ");
		   String sad =scan.nextLine();
		   
		   System.out.println("Adýnýz : "+ ad + "\n" + "Soyadýnýz : "+ sad);
		   scan.close();
		   //bir alt satýra geçmek için"\n" ifadesi kullanýlýr
	}

}
