package slideCalisma;

import java.util.Scanner;

public class SC1101 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int bas,bit ;
		
		System.out.println("ba�lang�� de�erini giriniz : ");
		bas =scan.nextInt();
		
		System.out.println("biti� de�erini giriniz : ");
		bit =scan.nextInt();
		 
		int j ;
		for(j = 0;j<bit-bas+1;j++) {
			System.out.println(bas+j);
		}
		
		scan.close();
	}

}
