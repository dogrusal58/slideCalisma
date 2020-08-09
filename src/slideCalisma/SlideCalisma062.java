package slideCalisma;

import java.util.Scanner;

public class SlideCalisma062 {

	public static void main(String[] args) {
		//bir önceki soruyu else ile çözdük.
	Scanner input = new Scanner(System.in);
	System.out.println("Bir sayý giriniz : ");
	int num = input.nextInt();
	if(num%3==0) {System.out.println("Sayý üçe bölünür");
	
	} else {
		System.out.println("sayý üçe bölünmez");
		
	}
input.close();
	}

}
