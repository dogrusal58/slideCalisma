package slideCalisma;

import java.util.Scanner;

public class SlideCalisma062 {

	public static void main(String[] args) {
		//bir �nceki soruyu else ile ��zd�k.
	Scanner input = new Scanner(System.in);
	System.out.println("Bir say� giriniz : ");
	int num = input.nextInt();
	if(num%3==0) {System.out.println("Say� ��e b�l�n�r");
	
	} else {
		System.out.println("say� ��e b�l�nmez");
		
	}
input.close();
	}

}
