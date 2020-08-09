package slideCalisma;

import java.util.Scanner;

public class SlideCalisma064 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Bir tamsayı giriniz : ");
		int num = input.nextInt();
		
		if(num>=0 && num < 10) {
			System.out.println("rakam");
			
		}else {System.out.println("sayı");
		
		}
		input.close();
	}

}
