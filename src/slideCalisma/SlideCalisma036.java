package slideCalisma;

import java.util.Scanner;
//(List,ArrayList,Scanner,Random,Date)javada java.util paketi alt�nda bir s�r� class var.Scanner bunlardan biri

public class SlideCalisma036 {

	public static void main(String[] args) {
		// kullan�c�dan istenen verilerle dairenin �evresini ve alan�n� bulunuz
		
		Scanner scan = new Scanner(System.in);
System.out.println("Yar��ap� giriniz :");
float r =scan.nextFloat();
float pi = 3.14159f;
float alan = pi*r*r;
float cevre =2*pi*r;
System.out.println("Alan  "+"="+" "+alan);
System.out.println("�evre "+"="+ " "+ cevre);
scan.close();
	}

}
