package slideCalisma;

import java.util.Scanner;

public class SC102 {

	public static void main(String[] args) {
		// Kullanýcýdan kredi kartý numarasýný alýn ve bu numaranýn üçüncü, dördüncü ve sonuncu 
		//rakamlarýný ekrana yazdýrýn.
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
