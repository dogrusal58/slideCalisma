package slideCalisma;

import java.util.Scanner;
//(List,ArrayList,Scanner,Random,Date)javada java.util paketi altýnda bir sürü class var.Scanner bunlardan biri

public class SlideCalisma036 {

	public static void main(String[] args) {
		// kullanýcýdan istenen verilerle dairenin çevresini ve alanýný bulunuz
		
		Scanner scan = new Scanner(System.in);
System.out.println("Yarýçapý giriniz :");
float r =scan.nextFloat();
float pi = 3.14159f;
float alan = pi*r*r;
float cevre =2*pi*r;
System.out.println("Alan  "+"="+" "+alan);
System.out.println("Çevre "+"="+ " "+ cevre);
scan.close();
	}

}
