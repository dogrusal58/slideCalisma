package slideCalisma;

import java.util.Scanner;

public class SC07 {

	public static void main(String[] args) {
		// Kullanýcýdan alýnan tam sayý 0 dan küçük ise negatif,0 ise nötr,
		//0 dan büyük ise pozitif yazdýralým.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayý giriniz : ");
		int num = input.nextInt();
		
		if(num<0) {
			System.out.println("negatif sayý girdiniz");
		
		}
		else if(num==0) {
			System.out.println("nötr");
			
		}
		else if(num>0){
			System.out.println("pozitif sayý girdiniz");
			
		}
		
		input.close();
		

	}

}
